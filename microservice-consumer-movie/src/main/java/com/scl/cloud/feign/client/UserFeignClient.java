package com.scl.cloud.feign.client;

import com.scl.cloud.feign.fallback.UserFeignClientFallBack;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

import com.scl.cloud.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用Feign自己的注解的 FeignClient
 * @author shengchenglong<br/>
 * @date 2017年8月29日 下午1:27:28<br/>
 * @version 
 * @since JDK 1.8
 */

// @FeignClient注解的name是一个任意的客户端名称，用于创建Ribbon负载均衡器
// 在本例中，使用了Eureka，则Ribbon会把microservice-provider-user解析成Eureka Server服务注册表中的服务

//@FeignClient(name = "microservice-provider-user")
// 自定义Feign配置（这里的configuration不写也会是该值，因为FeignConfiguration在Spring的上下文中）
@FeignClient(name = "microservice-provider-user", fallback = UserFeignClientFallBack.class) //, configuration = FeignConfiguration.class)

// 还可以使用url属性指定请求URL
//@FeignClient(name = "microservice-provider-user", url = "http://localhost:9999/")
public interface UserFeignClient {

//	使用Feign自带的注解
//	@RequestLine("GET /{id}")
//	public User findById(@Param("id") Long id);

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id);
}
