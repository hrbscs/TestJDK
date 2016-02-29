/*******************************************************************************
 *     File Name         :  jdk15.a03introspector.UserInfo
 *     Description       :  内省(Introspector) 是Java 语言对 JavaBean 类属性、事件的一种缺省处理方法。
 *                          JavaBean是一种特殊的类，主要用于传递数据信息，这种类中的方法主要用于访问私有的字段，且方法名符合某种命名规则。
 *                          如果在两个模块之间传递信息，可以将信息封装进JavaBean中，这种对象称为“值对象”(Value Object)，或“VO”。
 *                          方法比较少。这些信息储存在类的私有变量中，通过set()、get()获得。
 *                          在类UserInfo中有属性 userName, 那我们可以通过 getUserName,setUserName来得到其值或者设置新的值。
 *                          通过 getUserName/setUserName来访问 userName属性，这就是默认的规则。 
 *                          Java JDK中提供了一套 API 用来访问某个属性的 getter/setter 方法，这就是内省。
 *                          JDK内省类库：
 *                          PropertyDescriptor类:
 *                          PropertyDescriptor类表示JavaBean类通过存储器导出一个属性。主要方法：
 *                          　1. getPropertyType()，获得属性的Class对象;
 *                          　2. getReadMethod()，获得用于读取属性值的方法；getWriteMethod()，获得用于写入属性值的方法;
 *                          　3. hashCode()，获取对象的哈希值;
 *                          　4. setReadMethod(Method readMethod)，设置用于读取属性值的方法;
 *                          　5. setWriteMethod(Method writeMethod)，设置用于写入属性值的方法。
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a03introspector;

/**
 * @author SCS
 *
 */
public class Ac01UserInfo {
	private long userId;
	private String userName;
	private int age;
	private String emailAddress;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
