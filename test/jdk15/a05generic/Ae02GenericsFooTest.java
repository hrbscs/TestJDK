/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae02GenericsFooTest
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

/**
 * @author SCS
 *
 */
public class Ae02GenericsFooTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ae02GenericsFoo<String> strFoo = new Ae02GenericsFoo<String>("Hello Generics!");
		Ae02GenericsFoo<Double> douFoo = new Ae02GenericsFoo<Double>(new Double("33"));
		Ae02GenericsFoo<Object> objFoo = new Ae02GenericsFoo<Object>(new Object());
		System.out.println("strFoo.getX=" + strFoo.getX());
		System.out.println("douFoo.getX=" + douFoo.getX());
		System.out.println("objFoo.getX=" + objFoo.getX());
	}
}
