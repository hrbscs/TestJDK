/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae02GenericsFoo
 *     Description       :  泛型类
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月4日          沙长生              Created
 ******************************************************************************/
package jdk15.a05generic;

/**
 * @author SCS
 *
 */
public class Ae02GenericsFoo<T> {
	private T x;

	public Ae02GenericsFoo(T x) {
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

}
