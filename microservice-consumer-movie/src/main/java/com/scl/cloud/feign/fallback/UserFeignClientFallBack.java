package com.scl.cloud.feign.fallback;

import com.scl.cloud.feign.client.UserFeignClient;
import com.scl.cloud.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * UserFeignClient的回退类
 *
 * @author shengchenglong
 * @version 1.0
 * @since 17/9/7 16:06 JDK 1.8
 */
@Component
public class UserFeignClientFallBack implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setUsername("back");
        user.setId(new Long(1));
        return user;
    }
}
