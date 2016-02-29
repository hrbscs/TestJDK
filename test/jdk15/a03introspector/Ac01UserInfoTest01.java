/*******************************************************************************
 *     File Name         :  jdk15.a03introspector.Ac01UserInfoTest01
 *     Description       :  Introspector类:
 *                          将JavaBean中的属性封装起来进行操作。
 *                          在程序把一个类当做JavaBean来看，就是调用Introspector.getBeanInfo()方法，
 *                          得到的BeanInfo对象封装了把这个类当做JavaBean看的结果信息，即属性的信息。
 *                          
 *                          getPropertyDescriptors()，获得属性的描述，可以采用遍历BeanInfo的方法，来查找、设置类的属性。
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a03introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author SCS
 *
 */
public class Ac01UserInfoTest01 {

	// 用内省的方式写入指定属性的值
	public static void setProperty(Ac01UserInfo ac01UserInfo, String userName) throws Exception {
		PropertyDescriptor propDesc = new PropertyDescriptor(userName, Ac01UserInfo.class);
		Method methodSetUserName = propDesc.getWriteMethod();
		methodSetUserName.invoke(ac01UserInfo, "wong");
		System.out.println("set userName:" + ac01UserInfo.getUserName());
	}

	// 用内省的方式读取指定属性的值
	public static void getProperty(Ac01UserInfo ac01UserInfo, String userName) throws Exception {
		PropertyDescriptor proDescriptor = new PropertyDescriptor(userName, Ac01UserInfo.class);
		Method methodGetUserName = proDescriptor.getReadMethod();
		Object objUserName = methodGetUserName.invoke(ac01UserInfo);
		System.out.println("get userName:" + objUserName.toString());
	}

	// 获取类里面所有的属性名依次比较是否与给出的名字一致
	public static void setPropertyByIntrospector(Ac01UserInfo ac01UserInfo, String userName) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(Ac01UserInfo.class);
		PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
		if (proDescrtptors != null && proDescrtptors.length > 0) {
			for (PropertyDescriptor propDesc : proDescrtptors) {
				if (propDesc.getName().equals(userName)) {
					Method methodSetUserName = propDesc.getWriteMethod();
					methodSetUserName.invoke(ac01UserInfo, "alan");
					System.out.println("set userName:" + ac01UserInfo.getUserName());
					break;
				}
			}
		}
	}

	// 获取类里面所有的属性名依次比较是否与给出的名字一致
	public static void getPropertyByIntrospector(Ac01UserInfo ac01UserInfo, String userName) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(Ac01UserInfo.class);
		PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
		if (proDescrtptors != null && proDescrtptors.length > 0) {
			for (PropertyDescriptor propDesc : proDescrtptors) {
				if (propDesc.getName().equals(userName)) {
					Method methodGetUserName = propDesc.getReadMethod();
					Object objUserName = methodGetUserName.invoke(ac01UserInfo);
					System.out.println("get userName:" + objUserName.toString());
					break;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ac01UserInfo userInfo=new Ac01UserInfo();
        userInfo.setUserName("peida");
        try {
            getProperty(userInfo, "userName");
            setProperty(userInfo, "userName");
            getProperty(userInfo, "userName");
            
            setPropertyByIntrospector(userInfo, "userName");
            getPropertyByIntrospector(userInfo, "userName");
            
            // 报错是因为age属性是int数据类型，而setProperty方法里面默认给age属性赋的值是String类型。
            // 所以会爆出argument type mismatch参数类型不匹配的错误信息。
            setProperty(userInfo, "age"); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
