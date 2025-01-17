package com.ssafy.michelin_de_hanyang.global.error.exception;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class ResourceAlreadyExistsException extends RuntimeException {

	private final Object[] parameterValues;

	/**
	 *  요청이 서버의 현재 상태와 충돌함, 예를 들어 이미 존재하는 리소스를 생성하려고 할 때.
	 *  ex) exists(user)
	 */
	public ResourceAlreadyExistsException(String message, Object... parameterValues) {
		super(message + " Parameter Value: " + Arrays.toString(parameterValues));
		this.parameterValues = parameterValues;
	}
}
