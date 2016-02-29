/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae01GenTest
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
public class Ae01GenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义泛型类Gen的一个Integer版本
		Ae01Gen<Integer> intOb = new Ae01Gen<Integer>(100);
		intOb.showType();
		int i = intOb.getOb();
		System.out.println("value= " + i);
		System.out.println("----------------------------------");

		// 定义泛型类Ae01Gen的一个String版本
		Ae01Gen<String> strOb = new Ae01Gen<String>("Hello Dylan!");
		strOb.showType();
		String s = strOb.getOb();
		System.out.println("value= " + s);
	}
}
