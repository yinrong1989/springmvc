package com.yinrong.common.type.stringcasters;

import com.yinrong.common.type.StringCaster;


public class LongStringCaster implements StringCaster<Long> {
	private static LongStringCaster instance;
	private LongStringCaster(){}

	/**
	 * 获取单例实例
	 */
	public static LongStringCaster getInstance(){
		instance = new LongStringCaster();
		return instance;
	}
	public Long castFromString(String str) {
		return Long.parseLong(str);
	}
}
