/*******************************************************************************
 *     File Name         :  jdk15.a04reflection.Ad01StackTest
 *     Description       :  反射
 *                          反射就是让你可以通过名称来得到对象(类，属性，方法)的技术。
 *                          例如我们可以通过类名来生成一个类的实例；
 *                          知道了方法名，就可以调用这个方法；
 *                          知道了属性名就可以访问这个属性的值。
 * -----------------------------------------------------------------------------
 *     No.        Date              Revised by           Description
 *     0          2016年1月3日          沙长生              Created
 ******************************************************************************/
package jdk15.a04reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author SCS
 *
 */
public class Ad01ReflectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class<?> c = int.class;
			c = Integer.TYPE;
			c = Class.forName("java.util.Stack"); // 加载指定的类(三种方式都能加载)
			
			// 使用 getMethods 来代替 getDeclaredMethods，你还能获得继承来的各个方法的信息。
			Method m[] = c.getDeclaredMethods(); // 获取该类的所有方法信息
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString()); // 打印出该类所有方法
				
				Class<?> pvec[] = m[i].getParameterTypes(); // 打印出当前方法的入参类型
				for (int j = 0; j < pvec.length; j++)
					System.out.println("param #" + j + " " + pvec[j]);
				
				Class<?> evec[] = m[i].getExceptionTypes(); // 打印出当前方法的异常类型
				for (int j = 0; j < evec.length; j++)
					System.out.println("exc #" + j + " " + evec[j]);
				
				System.out.println("return type = " + m[i].getReturnType()); // 打印出当前方法的返回参数类型
				System.out.println("-----");
			}
			
			// 获取构造函数信息
			Constructor<?> ctorlist[] = c.getDeclaredConstructors();
			for (int i = 0; i < ctorlist.length; i++) {
				Constructor<?> ct = ctorlist[i];
				System.out.println("name = " + ct.getName());
				System.out.println("decl class = " + ct.getDeclaringClass());
				
				Class<?> pvec[] = ct.getParameterTypes();
				for (int j = 0; j < pvec.length; j++)
					System.out.println("param #" + j + " " + pvec[j]);
				
				Class<?> evec[] = ct.getExceptionTypes();
				for (int j = 0; j < evec.length; j++)
					System.out.println("exc #" + j + " " + evec[j]);
				System.out.println("-----");
			}
			
			// 获取数据字段信息
			Field fieldlist[] = c.getDeclaredFields();
			for (int i = 0; i < fieldlist.length; i++) {
				Field fld = fieldlist[i];
				System.out.println("name = " + fld.getName());
				System.out.println("decl class = " + fld.getDeclaringClass());
				System.out.println("type = " + fld.getType());
				
				int mod = fld.getModifiers();
				System.out.println("modifiers = " + Modifier.toString(mod)); // 结果为:private static final
				System.out.println("-----");
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
