/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae03CollectionGenFoo
 *     Description       :  限制泛型
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

import java.util.Collection;

/**
 * @author SCS
 *
 */
public class Ae03CollectionGenFoo<T extends Collection<?>> {
	private T x;

	public Ae03CollectionGenFoo(T x) {
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}
	
	public void showType() {
		System.out.println("T的实际类型是: " + x.getClass().getName());
		System.out.println("T的所有值为:");
		for (Object o : x) {
			System.out.println(o.toString());
		}
	}
}
