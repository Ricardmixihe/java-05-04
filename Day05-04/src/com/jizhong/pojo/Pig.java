package com.jizhong.pojo;

public class Pig{//Object
	public String name;//名字
	public double weight;//体重
	
	public void eat(){
		System.out.println("猪吃猪饲料！！！");
	}
	
	public String sleep(){
		System.out.println("猪在睡觉！！！");
		return "别打扰猪睡觉！！";
	}

	/**
	 * toString方法打印对象详细信息
	 * 快捷键：alt + s
	 */
	@Override
	public String toString() {
		return "Pig [name=" + name + ", weight=" + weight + "]";
	}
	
//	public String toString(){
//		return "名称：" + name + ",体重：" + weight;
//	}
	
}
