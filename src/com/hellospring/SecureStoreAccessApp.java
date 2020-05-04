package com.hellospring;

import com.thirdparty.SecureStore;

public class SecureStoreAccessApp {
	private SecureStore secureStore;
	
	public SecureStoreAccessApp(SecureStore secureStore) {
		this.secureStore=secureStore;
	}
	
	public void storeData() {
		secureStore.connect();
		secureStore.putData();
	}
	
	public void getData() {
		secureStore.connect();
		secureStore.accessData();
	}
	
	public void disconnect() {
		secureStore.disconnect();
	}
	
	
	

}
