/*******************************************************************************
 *     File Name         :  jdk15.a05generic.Ae04GenericFunctionTest
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
public class Ae04GenericFunctionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ae04GenericFunction ea = new Ae04GenericFunction();  
        ea.f(" ");  
        ea.f(10);  
        ea.f('a');  
        ea.f(ea); 
	}
}
