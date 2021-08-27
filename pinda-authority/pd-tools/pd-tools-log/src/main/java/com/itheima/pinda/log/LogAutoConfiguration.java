package com.itheima.pinda.log;


import com.itheima.pinda.log.aspect.SysLogAspect;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 日志自动配置
 * <p>
 * 启动条件：
 * 1，存在web环境
 * 2，配置文件中pinda.log.enabled=true
 * 3，配置文件中不存在：pinda.log.enabled 值
 *
 */

/**
 * 自定义一个日志工具，所有封装，通过自定义一个对应的注解进行标记，当有该注解的时候，进行事件监听，然后通过将该日志进行输出到
 * 对应的控制台或者日志文件中，或者数据库中
 *
 * 通过理解Spring的原理对于开发日志系统非常有用
 *【人生进度条系统的开发】
 */


@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
@ConditionalOnProperty(name = "pinda.log.enabled", havingValue = "true", matchIfMissing = true)
public class LogAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SysLogAspect sysLogAspect() {
        return new SysLogAspect();
    }
}

