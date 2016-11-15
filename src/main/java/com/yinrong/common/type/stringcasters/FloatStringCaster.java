package com.yinrong.common.type.stringcasters;

import com.yinrong.common.type.StringCaster;


public class FloatStringCaster implements StringCaster<Float> {
	private static FloatStringCaster instance;
	private FloatStringCaster(){}
	
	/**
	 * 获取单例实例
	 */
	public static FloatStringCaster getInstance(){
		instance = new FloatStringCaster();
		return instance;
	}
	public Float castFromString(String str) {
		return Float.parseFloat(str);
	}
}
