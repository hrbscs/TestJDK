/*******************************************************************************
 *     File Name         :  jdk15.a02varargus.Ab01varargusTest
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a02varargus;

/**
 * @author SCS
 *
 */
public class Ab01varargusTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ab01varargus.dealArray();  
		Ab01varargus.dealArray(1); 
		Ab01varargus.dealArray(1, 2); 
		Ab01varargus.dealArray(1, 2, 3); 
		
		int[] intArray = {1, 2}; 
		Ab01varargus.dealArray(intArray); //通过编译，正常运行 
	}
}
