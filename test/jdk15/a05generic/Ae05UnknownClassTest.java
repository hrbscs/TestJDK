/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae05UnknownClassTest
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author SCS
 *
 */
public class Ae05UnknownClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ae05UnknownClass ae05UnknownClass = new Ae05UnknownClass();
		
		// 通配符类型
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(36);
		arrayList.add(21);
		ae05UnknownClass.printCollection(arrayList);
		
		Collection<String> collection = new ArrayList<String>();
		collection.add("能正确识别子类型的类别");
		collection.add("说明是运行时动态获得的");
		ae05UnknownClass.printCollection(collection);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(58);
		set.add(97);
		ae05UnknownClass.printCollection(set);
		
		// 限制通配符类型
		ArrayList<Number> arrayList1 = new ArrayList<Number>();
		arrayList1.add(new Integer(37));
		arrayList1.add(new Double(34.0));
		ae05UnknownClass.drawAll(arrayList1);
		ae05UnknownClass.drawAll(arrayList1);
	}

}
