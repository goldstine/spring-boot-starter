package org.goldstine.config;

import org.goldstine.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建自动配置类，用于自动配置HelloService对象
 *
 */
@Configuration
@EnableConfigurationProperties(value = HelloProperties.class)
public class HelloServiceAutoConfiguration {

    private HelloProperties helloProperties;

    //通过构造器将对象注入
    public HelloServiceAutoConfiguration(HelloProperties helloProperties){
        this.helloProperties=helloProperties;
    }

    @ConditionalOnMissingBean   //加上条件，表示如果spring容器中没有实例则创建，如果有实例则不创建该对象，单例模式
    @Bean
    public HelloService helloService(){
        return new HelloService(helloProperties.getName(),helloProperties.getAddress());
    }
}
