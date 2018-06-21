package com.webservice.demo.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webservice.demo.interceptor.AuthInterceptor;
import com.webservice.demo.service.CommonService;

@Configuration
public class CxfConfig {

	@Autowired
	private Bus bus;

	@Autowired
	CommonService commonService;
	
	@Autowired
	CommonService commonService2;

	/** JAX-WS **/
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, commonService);
		endpoint.publish("/CommonService");
//		endpoint.getInInterceptors().add(new AuthInterceptor());  
		return endpoint;
	}

	/** JAX-WS **/
	@Bean
	public Endpoint endpoint1() {
		EndpointImpl endpoint = new EndpointImpl(bus, commonService2);
		endpoint.publish("/CommonService2");
//		endpoint.getInInterceptors().add(new AuthInterceptor());  
		return endpoint;
	}
	
}