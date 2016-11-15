package com.yinrong.common.type.stringcasters;

import com.yinrong.common.type.StringCaster;


public class BooleanStringCaster implements StringCaster<Boolean> {
	private static BooleanStringCaster instance;
	private BooleanStringCaster(){}
	
	/**
	 * 获取单例实例
	 */
	public static BooleanStringCaster getInstance(){
		instance = new BooleanStringCaster();
		return instance;
	}
	public Boolean castFromString(String str) {
		return Boolean.parseBoolean(str);
	}
}
