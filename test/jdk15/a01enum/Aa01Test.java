/*******************************************************************************
 *     File Name         :  jdk15.Aa01Test
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a01enum;

import jdk15.a01enum.Aa01;

/**
 * @author SCS
 *
 */
public class Aa01Test {
    public void change(Aa01 color) {
        switch (color) {
        case RED:
            color = Aa01.RED;
            System.out.println("RED");
            break;
        case YELLOW:
            color = Aa01.YELLOW;
            System.out.println("YELLOW");
            break;
        case GREEN:
            color = Aa01.GREEN;
            System.out.println("GREEN");
            break;
		default:
            System.out.println("null");
			break;
        }
    }
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Aa01Test().change(Aa01.YELLOW);
	}

}
