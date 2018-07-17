package com.xihuanyuye.config;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * 描述: 开启 CloudSolrClient 连接
 *
 * @author yanpenglei
 * @create 2017-10-18 18:15
 **/
@Configuration
@EnableSolrRepositories(basePackages = {"com.xihuanyuye"}, multicoreSupport = true)
public class SolrConfig {

/*    @Value("${spring.data.solr.zk-host}")
    private String zkHost;*/

/*   @Bean
    public CloudSolrClient solrClient() {
        return new SolrClient("http://172.16.90.65:8983/solr");
    }
*/
}
