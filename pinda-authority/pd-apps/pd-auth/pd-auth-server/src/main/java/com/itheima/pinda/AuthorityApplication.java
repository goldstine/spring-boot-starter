package com.itheima.pinda;

import com.itheima.pinda.auth.server.EnableAuthServer;
import com.itheima.pinda.user.annotation.EnableLoginArgResolver;
import com.itheima.pinda.validator.config.EnableFormValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 认证流程：
 * （1）用户通过前端系统发送登录请求，请求中携带账号，密码，验证码等信息
 * （2）前端登录请求首先请求到网关服务，网关服务则将请求路由到权限微服务
 * （3）权限为服务进行认证操作，如果认证通过则生成jwt token返回给前端，同时将用户拥有的资源权限使用
 * userId作为key保存到缓存中
 * 鉴权流程：
 *  （1）用户认证后访问其他功能时将jwt token放在请求头中，首先经过网关服务处理
 *  （2）在网关服务的过滤器中获取请求头中的token并进行解析，将解析出来的用户数据放在zuul的header
 *  （3）在网关服务的过滤器中进行鉴权相关处理
 *
 */

/**
 * 启动如果出现：
 * Command line is too long. Shorten command line for AuthorityApplication or also for Application default configuration.
 * 需要找到对应的项目workspace.xml文件对应的位置加上配置语句
 * 找到<component name="PropertiesComponent">，在里面添加<property name="dynamic.classpath" value="true" />即可
 */


/**
 * 权限服务启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAuthServer
@EnableFeignClients(value = {
        "com.itheima.pinda",
})
@Slf4j
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableLoginArgResolver
@EnableFormValidator
public class AuthorityApplication {
    public static void main(String[] args) throws UnknownHostException{
        ConfigurableApplicationContext context = SpringApplication.run(AuthorityApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String appName = environment.getProperty("spring.application.name");//获取对应的配置文件的信息
        String port = environment.getProperty("server.port");//获取对应的配置文件的端口配置
        String hostAddress = InetAddress.getLocalHost().getHostAddress();

        //启动完成后在控制台提示项目启动成功，并且输出当前服务对应的swagger接口文档访问地址
        //http://localhost:8080/doc.html
        log.info("应用{}启动成功!swagger地址：http://{}:{}/doc.html",appName,hostAddress,port);
    }
}