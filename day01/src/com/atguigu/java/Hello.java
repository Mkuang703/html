package com.atguigu.java;

/*
 *:1.对第一个java程序进行总结
 * 		编写：我们将编写的java代码保存在以".java"结尾的源文件中
 * 		编译：使用javac.exe命令编译我们的java源文件。格式：javac 源文件名.java
 *  	运行：使用java.exe命令解释运行我们的字节码文件。 格式：java 类名
 * 
 * 注释：
 * 		①javac.exe编译  java源文件		格式：javac 源文件名.java ; javac Hello.java
 * 		②java.exe 编译  字节码文件		 格式：java 类名			;  java Hello
 * 
 * 2.
 * 		在一个java源文件中可以声明多个class。但是，只能最多有一个类声明为public的。
 * 		而且要求声明为public的类的类名必须与源文件名相同。
 * 
 * 3. 
 * 		程序的入口是main()方法。格式是固定的。
 * 
 * 4. 输出语句：
 * 	 	System.out.println():先输出数据，然后换行
 *  	System.out.print():只输出数据
 *  
 *  5.
 *  	每一行执行语句都以";"结束。
 * */
public class Hello {
	public static void main(String[] args) {
		System.out.print("Hello World!");
		System.out.println();//换行
		System.out.println("Hello World!");
	}
	

}
  class Person{

}

class Animal{
	
}