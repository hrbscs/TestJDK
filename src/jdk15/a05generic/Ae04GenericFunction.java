/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae04GenericFunction
 *     Description       :  泛型方法
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

/**
 * @author SCS
 *
 */
public class Ae04GenericFunction {
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
}
