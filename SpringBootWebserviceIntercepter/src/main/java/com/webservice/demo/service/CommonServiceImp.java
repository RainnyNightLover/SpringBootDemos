package com.webservice.demo.service;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@WebService(serviceName = "CommonService", // 与接口中指定的name一致
targetNamespace = "com.webservice.demo.service", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.webservice.demo.service.CommonService"// 接口地址
)
@Component
public class CommonServiceImp implements CommonService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello ," + name;
	}

}
