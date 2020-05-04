package com.hellospring;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServerConfig implements InitializingBean, DisposableBean{
	
	private int id;
	private String userName;
	private String password;
	private String ip;
	private Map<String,String> configParams;
	
	public ServerConfig(int id,String userName,String password,String ip) {
		System.out.println("Injecting dependency through constructor..");
		this.id=id;
		this.userName=userName;
		this.password=password;
		this.ip=ip;
	}
	
	public Map<String,String> getConfigParams() {
		return configParams;
	}
	@Override
	public String toString() {
		return "ServerConfig [id=" + id + ", userName=" + userName + ", password=" + password + ", ip=" + ip
				+ ", configParams=" + configParams + "]";
	}

	public void setConfigParams(Map<String,String> configParams) {
		System.out.println("Injecting dependency through setters..");
		this.configParams=configParams;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Before object is destroyed.");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After object is constructed.");
		
	}

}
