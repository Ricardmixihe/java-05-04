package com.jizhong.controller;

import com.jizhong.pojo.Pig;

/**
 * 
 *创建对象：
 *	语法：
 *		类名 对象名 = new 类名();
 *
 *如何使用对象属性？
 *	赋值：对象名.属性名 = 值;
 *	获取：对象名.属性名;
 *
 *如何使用对象方法？
 *	调用方法：对象名.方法名();
 */
public class PigTest {
	public static void main(String[] args) {
		//实例化对象
		Pig zhujianqiang = new Pig();
		//如何使用对象属性？
		zhujianqiang.name = "猪坚强";
		zhujianqiang.weight = 160.12;
//		System.out.println("这头猪的名字为：" + zhujianqiang.name);
//		System.out.println("这头猪的体重为：" + zhujianqiang.weight);
//		
		Pig zhuzhuxia = new Pig();
		zhuzhuxia.name = "猪猪侠";
		zhuzhuxia.weight = 80.00;
//		System.out.println("这头猪的名字为：" + zhuzhuxia.name);
//		System.out.println("这头猪的体重为：" + zhuzhuxia.weight);
//		//如何使用对象方法？
//		zhuzhuxia.eat();//吃东西方法
//		String message = zhuzhuxia.sleep();//睡觉方法，返回值
//		System.out.println("调用睡觉方法后：" + message);
		System.out.println(zhuzhuxia);
	}
}
