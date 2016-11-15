package com.yinrong.common.type.stringcasters;


import com.yinrong.common.type.StringCaster;

import java.math.BigDecimal;

public class BigDecimalStringCaster implements StringCaster<BigDecimal> {
	private static BigDecimalStringCaster instance;
	private BigDecimalStringCaster(){}
	
	/**
	 * 获取单例实例
	 */
	public static BigDecimalStringCaster getInstance(){
		instance = new BigDecimalStringCaster();
		return instance;
	}

	public BigDecimal castFromString(String str) {
		return new BigDecimal(str);
	}
}
