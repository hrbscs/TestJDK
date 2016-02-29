/*******************************************************************************
 *     File Name         :  jdk15.a01enum.Aa03
 *     Description       :  自带 valueOf 方法，用于从数据库中把数据转化为枚举
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a01enum;

/**
 * @author SCS
 *
 */
public enum Aa03 {
	Allies(10000,"同盟"),  // 同盟(阵营为1)
	Axis(20000,"轴心"),    // 轴心(阵营为2)
	Neutral(30000,"中立"); // 中立(阵营为3)

	private int value;
	private String desc;
	private Aa03(int value,String desc) {
        this.value = value;
        this.desc=desc;
    }
	
    public int getValue() {
        return value;
    }
    public String getDesc() {
		return desc;
	}
	
	public static Aa03 valueOf(int value){
    	for (Aa03 enumValue : Aa03.values()) {
			if(value == enumValue.value)
				return enumValue;
		}
    	return null;
    }
	
	@Override
	public String toString() {
		return this.ordinal() + "_" + this.name() + "_" + this.value + "_" + this.desc;
	}
}
