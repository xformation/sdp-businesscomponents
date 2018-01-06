/**
 * 
 */
package com.synectiks.service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.elasticache.AmazonElastiCache;
import com.amazonaws.services.elasticache.AmazonElastiCacheClient;

/**
 * @author Rajesh
 */
@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
//@EnableElastiCache({ @CacheClusterConfig(name = "mytokencache") })
public class ElastiCaheConfig {

	private static final Logger logger = LoggerFactory.getLogger(ElastiCaheConfig.class);

	@Value("${amazon.elasticache.endpoint}")
	private String elastiCacheEndpoint;

	@Bean
	public AmazonElastiCache cacheClient() {
		logger.info("Initializing elastiCache");
		return AmazonElastiCacheClient.builder()
				.withRegion(Regions.EU_WEST_1)
				//.withEndpointConfiguration(new EndpointConfiguration(elastiCacheEndpoint,
				//		Regions.EU_WEST_1.getName()))
				.build();
	}

}
