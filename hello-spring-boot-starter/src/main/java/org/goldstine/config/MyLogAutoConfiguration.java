package org.goldstine.config;

import org.goldstine.log.MyLogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 单独为拦截器创建一个自动配置类
 */
@Configuration
public class MyLogAutoConfiguration implements WebMvcConfigurer {
    /**
     * 由于是一个web层的组件，所以还需要实现web层配置
     */
    //注册自定义日志拦截器

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyLogInterceptor());
    }
    //然后在spring.factories中追加MyLogAutoConfiguration配置
}
