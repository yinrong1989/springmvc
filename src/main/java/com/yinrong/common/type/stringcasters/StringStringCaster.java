package com.yinrong.common.type.stringcasters;

import com.yinrong.common.type.StringCaster;
public class StringStringCaster implements StringCaster<String> {
	private static StringStringCaster instance;
	private StringStringCaster(){}

	/**
	 * 获取单例实例
	 */
	public static StringStringCaster getInstance(){
		instance = new StringStringCaster();
		return instance;
	}

	public String castFromString(String str) {
		return str;
	}
}
