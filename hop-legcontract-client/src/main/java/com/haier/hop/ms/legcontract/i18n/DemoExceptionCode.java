package com.haier.hop.ms.legcontract.i18n;

import com.haier.hop.ms.exception.ExceptionResolvable;

public enum DemoExceptionCode implements ExceptionResolvable{
	
	SUCCESS(0,"demo.success"),
	TEST(500,"系统异常");

	private Integer code;
	
	private String message;

	public Integer getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return getMessage(this.message);
	}

	private DemoExceptionCode(Integer code,String message){
		this.code = code;
		this.message = message;
	}
	

}
