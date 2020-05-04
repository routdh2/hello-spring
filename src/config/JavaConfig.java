package config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hellospring.Instrument;
import com.hellospring.Piano;
import com.hellospring.Player;
import com.hellospring.SecureStoreAccessApp;
import com.hellospring.ServerConfig;
import com.thirdparty.SecureStore;
import com.thirdparty.SecureStoreImpl;

@Configuration
public class JavaConfig {
	@Bean
	@Autowired
	public Player player(Instrument instrument) {
		String song="Jingle-bell";
		return new Player(song,instrument);
	}
	
	@Bean
	public Instrument piano() {
		return new Piano();
	}
	
	@Bean(name="thirdparty")
	public SecureStoreAccessApp app(SecureStore secureStore) {
		return new SecureStoreAccessApp(secureStore);
	}
	
	@Bean(name="securestore")
	public SecureStore store() {
		int accountId=20;
		String userName="dhananjay";
		String password = "password";
		List<String> serverList=new ArrayList<>(Arrays.asList("1.2.3.4","2.3.4.5"));
		Map<String,String> configParams=new HashMap<>();
		configParams.put("core","16");
		configParams.put("ram","4gb");
		configParams.put("cpu", "intel");
		return new SecureStoreImpl(accountId,userName,password,serverList,configParams);
	}
	
	@Bean(initMethod="afterPropertiesSet", destroyMethod="destroy")
	public ServerConfig config() {
		int id=10;
		String userName="dhananjay";
		String password="password";
		String ip="1.2.3.4";
		Map<String,String> configParams=new HashMap<>();
		configParams.put("cpu", "intel");
		configParams.put("ram","4gb");
		ServerConfig config = new ServerConfig(id,userName,password,ip);
		config.setConfigParams(configParams);
		return config;
	}

}
