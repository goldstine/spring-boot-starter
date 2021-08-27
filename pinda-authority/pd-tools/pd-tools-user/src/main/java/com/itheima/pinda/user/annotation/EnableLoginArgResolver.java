package com.itheima.pinda.user.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.itheima.pinda.user.config.LoginArgResolverConfig;

import com.itheima.pinda.user.config.LoginArgResolverConfig;
import org.springframework.context.annotation.Import;

/**
 * 参数解析器属于Spring-web包中提供的组件，springmvc框架中对应提供了很多参数解析器例如我们开发的Controller
 * @RestController
 * @RequestMapping("user")
 * public class UserController{
 *      @PostMapping("/save")
 *      //此处request对象就是通过springmvc提供的参数解析器帮我们注入的
 *       public String saveUser(HttpServletRequst request){
 *           return "success";
 *      }
 * }
 *上面的HttpServletRequest对象就是通过springmvc提供的ServletRequestMethodArgumentResolver这个参数解析器
 * 帮我们注入的，同样如果我们需要使用HttpServletReponse对象，也可以直接在方法上加入这个参数即可此时sprinmvc会通过
 * ServletRequestMethodArgumentResolver这个参数解析器帮我们注入
 *
 * 在实际项目开发中，可以自定义对应的参数解析器，需要实现HandlerMethodArgumentResolver接口
 *
 * public interface HandlerMethodArgumentResolver {
 *     boolean supportsParameter(MethodParameter var1);
 *
 *     @Nullable
 *     Object resolveArgument(MethodParameter var1, @Nullable ModelAndViewContainer var2, NativeWebRequest var3, @Nullable WebDataBinderFactory var4) throws Exception;
 * }
 *
 *HandlerMethodArgumentResolver接口中有两个抽象方法supportsParameter  resolveArgument
 * 方法的调用通过servlet容器进行维护，不需要我们自己去调用，只有当supportsParameter返回值为true时
 *resolveArgument才返回对应的HttpServletRequest对象
 */


/**
 * 在启动类上添加该注解来----开启自动登录用户对象注入
 * Token转化SysUser
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(LoginArgResolverConfig.class)
public @interface EnableLoginArgResolver {
}
