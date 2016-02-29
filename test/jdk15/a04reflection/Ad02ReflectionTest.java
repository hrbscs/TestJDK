/*******************************************************************************
 *     File Name         :  jdk15.a04reflection.Ad02ReflectionTest
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a04reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author SCS
 *
 */
public class Ad02ReflectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 加载指定类名的类
			Class<?> cls = Class.forName("jdk15.a04reflection.Ad02Reflection");

			// 通过入参的名称和类型,找到指定方法
			Class<?> partypes[] = new Class[2];
			partypes[0] = Integer.TYPE;
			partypes[1] = Integer.TYPE;
			Method meth = cls.getMethod("add", partypes);

			// 创建一个新类,然后把参数送到指定的方法中去
			Object arglist[] = new Object[2];
			arglist[0] = new Integer(37);
			arglist[1] = new Integer(47);
			Object retobj = meth.invoke(cls.newInstance(), arglist);
			Integer retval = (Integer) retobj;
			System.out.println(retval.intValue());
			
			// 输入的参数为可变长度参数,所以可以不用数组,直接输入
			System.out.println( (Integer) meth.invoke(cls.newInstance(), 21 , 47));
			
			// 调用构造函数的例子
			partypes = new Class[2];
			partypes[0] = Integer.TYPE;
			partypes[1] = Integer.TYPE;
			Constructor<?> ct = cls.getConstructor(partypes);
			retobj = ct.newInstance(37,47);
			
			// 利用反射改变字段(域)的值的例子见,自省(introspector)
			// 利用反射动态创建数组
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

}
