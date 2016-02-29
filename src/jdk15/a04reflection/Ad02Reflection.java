/*******************************************************************************
 *     File Name         :  jdk15.a04reflection.Ad02Reflection
 *     Description       :  反射
 *                          反射除了可以获取类的信息有关。
 *                          我们也可以用 reflection 来做一些其它的事情，比如执行一个指定了名称的方法
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a04reflection;

/**
 * @author SCS
 *
 */
public class Ad02Reflection {
	public Ad02Reflection() {
	}

	public Ad02Reflection(int a, int b) {
		System.out.println("a = " + a + " b = " + b);
	}
	
	public int add(int a, int b) {
		return a + b;
	}
}
