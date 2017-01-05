package com.cache.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * contains configuration for Sentinel and scans for Spring beans
 * @author ppatro
 *
 */

@Configuration
/*@ComponentScan(basePackages = {"com.cache.configuration",
								"com.cache.controller",
								"com.cache.service",
								"com.cache.dao"})*/
@EnableWebMvc
@ComponentScan(basePackages ={ "com.cache" }, excludeFilters = { 
@Filter(type = FilterType.ANNOTATION, value = Configuration.class) })
public class AppConfig extends WebMvcConfigurerAdapter{
	
	/*@Value("${ptc.sentinel.host}")
	private String sentinelHost;
	
	@Value("${ptc.sentinel.instance.one.port}")
	private int sentinelFirstInstance;
	
	@Value("${ptc.sentinel.instance.two.port}")
	private int sentinelSecondInstance;
	
	@Value("${ptc.sentinel.instance.three.port}")
	private int sentinelThirdInstance;
	*/
	/*@Bean
	public PropertyPlaceholderConfigurer placeholderConfigurer(){
		PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
		placeholderConfigurer.setLocation(new ClassPathResource("cache.properties"));
		return placeholderConfigurer;
	}*/
	
/*	@Bean
	public LogUtils logUtils(){
		System.out.println(":::::::: host name is ::::::::::"+PropertiesLiterals.SENTINEL_HOST+" ::::::: ");
		System.out.println(":::::::: host name is ::::::::::"+PropertiesLiterals.SENTINEL_FIRST_INSTANCE+" ::::::: ");
		//System.out.println(":::::::: host name is ::::::::::"+env.getProperty("ptc.sentinel.host")+" :::::::: ");
		return new LogUtils();
	}*/
	/*@Bean
	public RedisConnectionFactory connectionFactory(RedisSentinelConfiguration redisSentinelConfiguration) {
		JedisConnectionFactory factory = new JedisConnectionFactory(redisSentinelConfiguration);
	    factory.setUsePool(true);
		return factory;
	}*/
	
	/*@Bean
	public RedisSentinelConfiguration sentinelConfig() {
		System.out.println(":::::::: host name is ::::::::::"+sentinelHost+" ::::::: ");
		System.out.println(":::::::: host name is ::::::::::"+sentinelFirstInstance+" ::::::: ");
		return new RedisSentinelConfiguration().master(CacheLiterals.REDIS_MASTER_INSTANCE_NAME) 
				.sentinel(sentinelHost, sentinelFirstInstance) 
				.sentinel(sentinelHost, sentinelSecondInstance) 
				.sentinel(sentinelHost, sentinelThirdInstance);
	}*/
	
	/*@Bean
	public RedisSentinelConfiguration sentinelConfig() {
		System.out.println(":::::::: host name is ::::::::::"+sentinelHost+" ::::::: ");
		System.out.println(":::::::: host name is ::::::::::"+sentinelFirstInstance+" ::::::: ");
		return new RedisSentinelConfiguration().master(CacheLiterals.REDIS_MASTER_INSTANCE_NAME) 
				.sentinel(env.getProperty("ptc.sentinel.host"), Integer.parseInt(env.getProperty("ptc.sentinel.instance.one.port"))) 
				.sentinel(env.getProperty("ptc.sentinel.host"), Integer.parseInt(env.getProperty("ptc.sentinel.instance.two.port"))) 
				.sentinel(env.getProperty("ptc.sentinel.host"), Integer.parseInt(env.getProperty("ptc.sentinel.instance.three.port")));
	}
	
	@Bean
    public RedisTemplate< String, Object > redisTemplate(RedisConnectionFactory jedisConnectionFactory) {
        final RedisTemplate< String, Object > template =  new RedisTemplate< String, Object >();
        template.setConnectionFactory( jedisConnectionFactory );
        template.setKeySerializer( new StringRedisSerializer() );
        template.setHashValueSerializer( new GenericToStringSerializer< Object >( Object.class ) );
        template.setValueSerializer( new GenericToStringSerializer< Object >( Object.class ) );
        return template;
    }*/
	
	/*@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}*/

}
