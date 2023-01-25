package com.zerobase.member.model;

import com.zerobase.member.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class WebResponseData<T> {

	private ErrorCode code;
	private T data;

	public static <T> WebResponseData<T> ok(T data) {
		return new WebResponseData<T>(ErrorCode.SUCCESS, data);
	}

	public static <T> WebResponseData<T> error(ErrorCode errorCode, T data) {
		return new WebResponseData<T>(errorCode, data);
	}
}
