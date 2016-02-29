/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae04UnknownClass
 *     Description       :  这个是接口泛型的例子
 *                          jdk8以上支持接口中定义默认方法的实现了
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

import java.util.Set;

public interface ICacheManager<K, V> {
	public V get(K key);
	public V getNotFromDB(K key);
	public void put(K key,V value);
	public void remove(K key);
	public Set<K> getKeySet();
	public String getRegionName();
}
