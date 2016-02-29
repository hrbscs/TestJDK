/*******************************************************************************
 *     File Name         :  jdk15.Aa02Test
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a01enum;

import org.junit.Test;

import jdk15.a01enum.Aa02;

/**
 * @author SCS
 *
 */
public class Aa02Test {

	/**
	 * Test method for {@link jdk15.a01enum.Aa02#getName(int)}.
	 */
	@Test
	public void testGetNameInt() {
		System.out.println("------1--------------------------------");
		System.out.println(Aa02.getName(2));
	}

	/**
	 * Test method for {@link jdk15.a01enum.Aa02#getName()}.
	 */
	@Test
	public void testGetName() {
		System.out.println("------2--------------------------------");
		System.out.println(Aa02.BLANK.getName());
	}

	/**
	 * Test method for {@link jdk15.a01enum.Aa02#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName() {
		System.out.println("------3--------------------------------");
		Aa02.BLANK.setName("新白色");
		System.out.println(Aa02.BLANK.getName());
	}

	/**
	 * Test method for {@link jdk15.a01enum.Aa02#getIndex()}.
	 */
	@Test
	public void testGetIndex() {
		System.out.println("------4--------------------------------");
		System.out.println(Aa02.BLANK.getIndex());
	}

	/**
	 * Test method for {@link jdk15.a01enum.Aa02#setIndex(int)}.
	 */
	@Test
	public void testSetIndex() {
		System.out.println("------5--------------------------------");
		Aa02.BLANK.setIndex(110);
		System.out.println(Aa02.BLANK.getIndex());
	}

	/**
	 * Test method for {@link jdk15.a01enum.Aa02#toString()}.
	 */
	@Test
	public void testToString() {
		System.out.println("------6--------------------------------");
		System.out.println(Aa02.BLANK.toString());
	}

}
