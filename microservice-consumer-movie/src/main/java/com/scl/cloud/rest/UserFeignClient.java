package com.scl.cloud.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.scl.cloud.pojo.User;

/**
 * 
 * @author shengchenglong<br/>
 * @date 2017年8月29日 下午1:27:28<br/>
 * @version 
 * @since JDK 1.8
 */

// @FeignClient注解的name是一个任意的客户端名称，用于创建Ribbon负载均衡器
// 在本例中，使用了Eureka，则Ribbon会把microservice-provider-user解析成Eureka Server服务注册表中的服务
@FeignClient(name = "microservice-provider-user")
// 还可以使用url属性指定请求URL
//@FeignClient(name = "microservice-provider-user", url = "http://localhost:9999/")
public interface UserFeignClient {
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable("id") Long id);

}
