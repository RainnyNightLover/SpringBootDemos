package com.xihuanyuye.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.xihuanyuye.utils.CacheUtils;


@Configuration
@Import({RedisConfig.class, CacheUtils.class})
public class RedisAutoConfiguration {

}