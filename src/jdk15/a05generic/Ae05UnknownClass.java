/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae04UnknownClass
 *     Description       :  Collection<?> 通配符类型
 *                          Colleciton<Object>并不是任意类型的Collection的超类。 
 *                          那么什么是所有Colleciton类型的超类型呢？
 *                          它是Collection<?>这样一个类型，读作“未知Colleciton”。
 *                          它的意思是说Colleciton的元素类型可以匹配任意类型，我们把它称作通配符类型
 *                          
 *                           <? extends Class>是一种限制通配符类型，它可以接受所有<Class>以及Class的子类型。
 *                           然而调用代价是，只读访问，无法向shapes中添加非空元素。
 *                           
 *                           编写泛型类要注意：
 *                             1) 在定义一个泛型类的时候，在 “<>”之间定义形式类型参数，
 *                                例如：“class TestGen<K,V>”，其中“K” , “V”不代表值，而是表示类型。
 *                             2) 实例化泛型对象的时候，一定要在类名后面指定类型参数的值（类型），一共要有两次书写。例如：
 *                                TestGen<String,String> t=new TestGen<String,String>()；
 *                             3) 泛型中<K extends Object>,extends并不代表继承，它是类型范围限制。 
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

import java.util.Collection;
import java.util.List;

/**
 * @author SCS
 *
 */
public class Ae05UnknownClass {
	
	// 通配符类型
	void printCollection(Collection<?> c) {
		System.out.println(c.getClass().getName());
		for (Object e : c) {
			System.out.println(e.getClass().getName()+"_"+e.toString());
		}
		System.out.println("------------------------------------------------");
	}
	
	// 限制通配符类型，它可以接受所有<Class>以及Class的子类型。
	// 然而调用代价是，只读访问，无法向shapes中添加非空元素。
	void drawAll(List<? extends Number> numObj) {
//		numObj.add(0,new Integer(37));//编译时错误 
		for (Number e : numObj) {
			if(e != null)
				System.out.println(e.getClass().getName() + "_" + e.toString());
			else
				System.out.println("空元素");
		}
		System.out.println("------------------------------------------------");
		numObj.add(0,null); // 只能加入空元素
		numObj.add(null);
	}
}
