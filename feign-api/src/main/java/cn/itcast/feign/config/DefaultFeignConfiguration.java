package cn.itcast.feign.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 *  @author Yang YiGang
 *  @version 1.0
 *  @date 2021/10/24 16:13
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLeven(){
        return Logger.Level.BASIC;
    }
}
