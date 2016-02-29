/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae03CollectionGenFooTest
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author SCS
 *
 */
public class Ae03CollectionGenFooTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ae03CollectionGenFoo<ArrayList<Integer>> listFoo = new Ae03CollectionGenFoo<ArrayList<Integer>>(new ArrayList<Integer>());
		listFoo.getX().add(37);
		listFoo.getX().add(21);
		listFoo.showType();
		System.out.println("---------------------------------------------------------------");

		Ae03CollectionGenFoo<? extends Collection<String>> listFoo1 = new Ae03CollectionGenFoo<ArrayList<String>>(new ArrayList<String>());
		listFoo1.getX().add("测试一");
		listFoo1.getX().add("测试二");
		listFoo1.showType();
 
		System.out.println("实例化成功!");
	}

}
