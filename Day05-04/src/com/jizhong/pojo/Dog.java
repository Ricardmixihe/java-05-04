package com.jizhong.pojo;


/**
 * 方法语法
 * 		权限修饰符 返回值类型 方法名称(参数){
 * 						方法体;
 * 		}
 * 
 * 权限修饰符：
 * 		public：公共的
 * 		protected：
 * 		default：默认
 * 		private：私有
 * 返回值类型：
 * 		1. 基本数据类型
 * 		2. 引用数据类型
 * 		3. void：没有返回值
 * 方法名称：
 * 		小驼峰命名规则
 * 参数：
 * 		数据类型
 * 		形参变量名
 */
public class Dog {
	//属性
	//属性数据类型  属性名;
	String name;//名称
	int age;//年龄
	String color;//颜色
	
	//方法
	public void eat(){
		System.out.println("狗吃骨头~~~~");
		Pig pig = new Pig();
		pig.name = "";
	}
}
