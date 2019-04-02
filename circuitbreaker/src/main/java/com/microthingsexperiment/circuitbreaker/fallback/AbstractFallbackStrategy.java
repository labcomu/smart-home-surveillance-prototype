package com.microthingsexperiment.circuitbreaker.fallback;

public abstract class AbstractFallbackStrategy {

	public <T> T getDefaultFallback(String deviceId, Class<T> clazz) throws Exception {
		return null;
	}
	
	public void updateDefaultValue(String deviceId, Object value) {
	}
	
}
