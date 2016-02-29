/*******************************************************************************
 *     File Name         :  jdk15.a01enum.Aa02
 *     Description       :  如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。
 *                          而且 Java 要求必须先定义 enum 实例。
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a01enum;

/**
 * @author SCS
 *
 */
public enum Aa02 {
	RED("红色", 1), 
	GREEN("绿色", 2), 
	BLANK("白色", 3), 
	YELLO("黄色", 4);
	
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private Aa02(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (Aa02 c : Aa02.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    // 覆盖方法
    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }
}
