/*******************************************************************************
 *     File Name         :  jdk15.a02varargus.Ab01varargus
 *     Description       :  可变参数（Varargs）
 *                          Java方法中的可变参数类型是一个非常重要的概念，有着非常广泛的应用。
 *                          本文就以实例形式对此加以分析。具体如下：
 *                          一般来说，许多Java初学者在看到下面的这段代码的时候，
 *                          都会问一个问题：dealArray方法里那三个小点点是什么啊？
 *                          这就是本文所要讨论的问题：可变的参数类型，也称为不定参数类型。
 *                          英文缩写是varargus，还原一下就是variable argument type。
 *                          通过它的名字可以很直接地看出来，这个方法在接收参数的时候，个数是不定的。
 *                          
 *                          可变参数是兼容数组类参数的，但是数组类参数却无法兼容可变参数。
 *                          可变参数类型必须作为参数列表的最后一项，而不能放在定长参数的前面。
 *                          能匹配定长的方法，那么优先匹配该方法。含有不定参数的那个重载方法是最后被选中的。
 *                          main方法的参数就是一个数组类型的，那么它其实也是可以改成不定参数类型。
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a02varargus;

/**
 * @author SCS
 *
 */
public class Ab01varargus {
	public static void dealArray(int... intArray) {
		for (int i : intArray)
			System.out.print(i + " ");

		System.out.println();
	}
	
	public static void dealArray(int count, int count2) {
		System.out.println("固定参数的方法");
	}
	
	// 会有Duplicate method dealArray(int[]) in type TestVarArgus的错误
//	public static void dealArray(int[] intArray) {
//		for (int i : intArray)
//			System.out.print(i + " ");
//
//		System.out.println();
//	} 
}
