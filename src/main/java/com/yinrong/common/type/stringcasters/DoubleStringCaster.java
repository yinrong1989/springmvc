package com.yinrong.common.type.stringcasters;

import com.yinrong.common.type.StringCaster;


public class DoubleStringCaster implements StringCaster<Double> {
	private static DoubleStringCaster instance;
	private DoubleStringCaster(){}
	
	/**
	 * 获取单例实例
	 */
	public static DoubleStringCaster getInstance(){
		instance = new DoubleStringCaster();
		return instance;
	}
	public Double castFromString(String str) {
		return Double.parseDouble(str);
	}
}
