/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae01Gen
 *     Description       :  泛型参数
 *                          没有泛型的情况的下，通过对类型Object的引用来实现参数的“任意化”，
 *                          “任意化”带来的缺点是要做显式的强制类型转换，而这种转换是要求开发者对实际参数类型可以预知的情况下进行的。
 *                          对于强制类型转换错误的情况，编译器可能不提示错误，在运行的时候才出现异常，这是一个安全隐患。
 *                          泛型的好处是在编译的时候检查类型安全，并且所有的强制转换都是自动和隐式的，提高代码的重用率。
 *                          
 *                          其实Java的泛型就是创建一个用类型作为参数的类。
 *                          就象我们写类的方法一样，方法是这样的method(String str1,String str2 ),方法中参数str1、str2的值是可变的。
 *                          而泛型也是一样的，这样写class Java_Generics<K,V>，这里边的K和V就象方法中的参数str1和str2,也是可变
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

/**
 * @author SCS
 *
 */
public class Ae01Gen<T> {
	private T ob; // 定义泛型成员变量

	public Ae01Gen(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public void showType() {
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}
}
