package com.itheima.pinda.auth.client.configuration;


import com.itheima.pinda.auth.client.properties.AuthClientProperties;
import com.itheima.pinda.auth.client.utils.JwtTokenClientUtils;

import com.itheima.pinda.auth.client.utils.JwtTokenClientUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * 客户端认证配置
 *
 * 认证机制介绍：
 *    （1）  Http Basic Auth
 *      Http Basic Auth是一种简单的登录认证方式，web浏览器获取他客户端程序在请求时提供用户名和密码，通常用户名和密码会通过http头传递
 *
 *      将字符串通过Base64进行编码
 *      即将username:password====>base64编码===》发送出去
 *缺点，由于用户名和密码都是Base64编码的，而Base64编码是可逆的，所以用户名和密码可以认为是明文的，所以只有在客户端和服务器主机之间的连接是安全可信的前提下才可以使用
 * 基本认证，几乎所有的网页浏览器都支持基本认证
 *
 * （2）Cookie-Session Auth认证机制
 * 通过浏览器的Cookie对象和服务器端的Session对象匹配来实现状态管理
 * 第一次请求认证的时候会在服务端创建一个Session对象，同时在用户的浏览器端创建一个Cookie对象，当关闭浏览器的时候，cookie会删除，但是可以通过
 * 设置cookie的expire time使cookie在一定时间内有效
 *
 * 优点是比基本的认证方式更加安全
 * 缺点是：本身很难扩展，随着不同客户端的增加，独立的服务器已经很难承载更多的用户，而这时候基于session认证的问题就会出现问题
 *
 * （3）OAuth
 * OAuth是一个关于授权（authorization）的开放网络标准，允许用户提供一个令牌，而不是用户名和密码来访问它们存放在特定服务提供者的数据
 * 现在的版本是2.0
 * 严格来说，OAuth不是一个标准协议，而是一个安全的授权框架，他详细描述了系统中不同角色，用户，服务前端应用（比如api）
 * 以及客户端之间（比如网站或移动app）之间怎么实现相互认证
 *
 * 优点：快速开发，代码量小。维护工作少
 * 如果API要被不同的app使用，并且每个APP使用的方式也不一样，使用OAuth2是一个不错的选择
 *
 * （4）Token Auth
 * api可以采用标准化的Json web token(JWT).这个标准已经存在多个后端库（.NET,Ruby,java,python,Php）
 *
 *
 * JWT:
 *  jwt适合分布式站点的单点登录SSO场景，JWT的声明一般被用来在身份提供者和服务提供者之间传递被认证的用户身份信息，以便于从资源服务器获取资源，也可被加密
 *
 *jwt就是一个字符串：包括三个部分：jwt头，有效载荷，签名
 *通过base64将字符串进行编码，然后通过加密算法进行签名
 *
 * jwt签名算法：
 *      HS256,RS256
 *      HS256:带有SHA-256的HMAC,是一种对称加密算法，双方之间仅共享一个密钥
 *      RS256：非对称加密算法，使用公钥和私钥
 *
 *
 *      jjwt:是一个提供jwt创建和验证的java库，使用之前导入对应的依赖jjwt
 *
 */
@EnableConfigurationProperties(value = {
        AuthClientProperties.class,
})
public class AuthClientConfiguration {
    @Bean
    public JwtTokenClientUtils getJwtTokenClientUtils(AuthClientProperties authClientProperties) {
        return new JwtTokenClientUtils(authClientProperties);
    }

}
