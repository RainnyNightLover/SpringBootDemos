package com.webservice.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations= {"classpath:application_bean.xml"}) 
public class CxfConfig {
		
}
