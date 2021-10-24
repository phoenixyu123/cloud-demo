package cn.itcast.feign.clients;

import cn.itcast.feign.pojo.User;
import cn.itcast.feign.config.DefaultFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Yang YiGang
 * @version 1.0
 * @date 2021/10/24 16:13
 */
@FeignClient(name = "userservice",configuration = DefaultFeignConfiguration.class)
public interface UserClient {
    /**
     * 该方法定义了一个接口用于远程调用userservice服务根据id获取用户信息
     * @param id 用户id作为输入
     * @return 接收返回类型为User类型
     */
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
