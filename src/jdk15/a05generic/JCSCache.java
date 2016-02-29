/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae04UnknownClass
 *     Description       :  老版的jcs,需要自己写泛型; 2.0 新版改动非常大
 *                          为了使用泛型,而在 JCS.getInstance( regionName ) 外面包了一层应用
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.apache.jcs.engine.behavior.ICompositeCacheAttributes;


public class JCSCache<K, V> {
	private static final Log log = LogFactory.getLog(JCSCache.class);
	private String regionName;
	private JCS cache = null;

	/**
	 * 构造函数
	 * @param regionName
	 */
	public JCSCache(String regionName) {
		try {
			this.regionName = regionName;
			cache = JCS.getInstance(regionName);
        } catch ( CacheException e ) {
            log.error("JCSCache: 构造, regionName="+regionName+" 时,发生异常.", e);
        }
	}
	
	/**
	 * 返回配置文件基本信息
	 * @return
	 */
	public ICompositeCacheAttributes getCacheAttributes() {
		return cache.getCacheAttributes();
	}
	public String getRegionName() {
		return regionName;
	}
	
	/**
	 * 保存,这里注意 value 不可以为null
	 * @param key
	 * @param value
	 */
	public void put(K key, V value) {
        try {
            if ( value != null ) {
                cache.put( key, value );
            }
        } catch ( CacheException e ) {
             log.error( "JCSCache: 保存, regionName="+cache.getCacheAttributes().getCacheName()+" ,key="+key+" ,value="+value+" ,时异常.", e );
        }
	}

	/**
	 * 移除指定对象
	 * @param key
	 */
	public void remove(K key) {
		try {
			cache.remove(key);
		} catch (CacheException e) {
			log.error( "JCSCache: 移除, regionName="+cache.getCacheAttributes().getCacheName()+" ,key="+key+" ,时异常.", e );
		}
	}

	@SuppressWarnings("unchecked")
	public V get(K key) {
		return (V) cache.get(key);
	}
	
	@SuppressWarnings("unchecked")
	public Set<K> getKeySet() {
		return cache.getGroupKeys(regionName);
	}
}
