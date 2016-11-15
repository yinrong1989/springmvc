package com.yinrong.common.type.stringcasters;

import com.yinrong.common.type.StringCaster;


public class IntegerStringCaster implements StringCaster<Integer> {
	private static IntegerStringCaster instance;
	private IntegerStringCaster(){}

	/**
	 * 获取单例实例
	 */
	public static IntegerStringCaster getInstance(){
		instance = new IntegerStringCaster();
		return instance;
	}
	public Integer castFromString(String str) {
		return Integer.valueOf(str);
	}
}
