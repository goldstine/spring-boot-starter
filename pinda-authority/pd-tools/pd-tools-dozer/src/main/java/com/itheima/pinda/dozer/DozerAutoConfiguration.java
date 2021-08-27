package com.itheima.pinda.dozer;


import com.github.dozermapper.core.Mapper;

import org.springframework.context.annotation.Bean;


/**
 * Dozer spring auto configuration.
 * <p>
 * ConditionalOnClass：该注解的参数对应的类必须存在，否则不解析该注解修饰的配置类；
 * ConditionalOnMissingBean：该注解表示，如果存在它修饰的类的bean，则不需要再创建这个bean；
 * <p>
 * http://dozer.sourceforge.net/documentation/usage.html
 * http://www.jianshu.com/p/bf8f0e8aee23
 *
 */
public class DozerAutoConfiguration {
    @Bean
    public DozerUtils getDozerUtils(Mapper mapper) {
        DozerUtils dozerUtils = new DozerUtils(mapper);
        return dozerUtils;
    }
}

/**
 * pd-tools-dozer:模块定位为对象转换，其本质就是一个Spring-boot-starter,其他模块可以直接导入此模块就可以直接完成对象转换了
 * Dozer是javabean到javabean映射器，它以递归方式将数据从一个对象复制到另一个对象，dozer是用来对两个对象之间属性转换的工具
 * 有了这个工具之后，我们将以。。。。相当于beanutils
 */
