/*******************************************************************************
 *     File Name         :  jdk15.Aa03Test
 *     Description       :  说明
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a01enum;

import java.util.EnumMap;
import java.util.EnumSet;

import jdk15.a01enum.Aa03;

/**
 * @author SCS
 *
 */
public class Aa03Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // 1.遍历枚举类型
        System.out.println("演示枚举类型的遍历 ......");
        testTraversalEnum();

        // 2.演示EnumMap对象的使用
        System.out.println("\r\n演示EnmuMap对象的使用和遍历.....");
        testEnumMap();

        // 3.演示EnmuSet的使用
        System.out.println("\r\n演示EnmuSet对象的使用和遍历.....");
        testEnumSet();
    }

    /**
     * 
     * 演示枚举类型的遍历
     */
    private static void testTraversalEnum() {
        Aa03[] allAa03 = Aa03.values();
        for (Aa03 aAa03 : allAa03) {
            System.out.println("当前ordinal：" + aAa03.ordinal());
            System.out.println("当前name：" + aAa03.name());
            System.out.println("当前Value：" + aAa03.getValue());
            System.out.println("当前Desc：" + aAa03.getDesc());
            System.out.println("当前：" + aAa03);
        }
    }

    /**
     * 
     * 演示EnumMap的使用，EnumMap跟HashMap的使用差不多，只不过key要是枚举类型
     */
    private static void testEnumMap() {
        // 1.演示定义EnumMap对象，EnumMap对象的构造函数需要参数传入,默认是key的类的类型
        EnumMap<Aa03, String> currEnumMap = new EnumMap<Aa03, String>(Aa03.class);
        currEnumMap.put(Aa03.Allies, "同盟_值");
        currEnumMap.put(Aa03.Axis, "轴心_值");
        currEnumMap.put(Aa03.Neutral, "中立_值");

        // 2.遍历对象
        for (Aa03 aAa03 : Aa03.values()) {
            System.out.println("[key=" + aAa03.name() + ",value=" + currEnumMap.get(aAa03) + "]");
        }
    }

    /**
     * 
     * 演示EnumSet如何使用，EnumSet是一个抽象类，获取一个类型的枚举类型内容<BR/>
     * 
     * 可以使用allOf方法
     */
    private static void testEnumSet() {
        EnumSet<Aa03> currEnumSet = EnumSet.allOf(Aa03.class);
        for (Aa03 aAa03SetElement : currEnumSet) {
            System.out.println("当前EnumSet中数据为：" + aAa03SetElement);
        }
    }
}
