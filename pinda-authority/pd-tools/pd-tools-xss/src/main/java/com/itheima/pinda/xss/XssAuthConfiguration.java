package com.itheima.pinda.xss;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import com.itheima.pinda.xss.converter.XssStringJsonDeserializer;
import com.itheima.pinda.xss.filter.XssFilter;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * XSS 跨站攻击自动配置
 *
 * AntiSamy是OWASP的一个开源项目，通过对用户输入的html/css/javascript等内容进行检验和清理，确保输入符合应用规范，AntiSamy被广泛应用于web
 * 服务对存储型和反射型XSS的防御中
 *
 */
public class XssAuthConfiguration {
    /**
     * 配置跨站攻击 反序列化处理器
     *
     * @return
     */
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer2() {
        return builder -> builder
                .deserializerByType(String.class, new XssStringJsonDeserializer());
    }


    /**
     * 配置跨站攻击过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        //TODO 想想这里如何扩展

        FilterRegistrationBean filterRegistration = new FilterRegistrationBean(new XssFilter());
        filterRegistration.addUrlPatterns("/*");
        filterRegistration.setOrder(1);

        Map<String, String> initParameters = new HashMap<>(2);
        String excludes = new StringJoiner(",")
                .add("/favicon.ico")
                .add("/doc.html")
                .add("/swagger-ui.html")
                .add("/csrf")
                .add("/webjars/*")
                .add("/v2/*")
                .add("/swagger-resources/*")
                .add("/resources/*")
                .add("/static/*")
                .add("/public/*")
                .add("/classpath:*")
                .add("/actuator/*")
                .toString();
        initParameters.put("excludes", excludes);
        initParameters.put("isIncludeRichText", "true");
        filterRegistration.setInitParameters(initParameters);
        return filterRegistration;
    }
}
