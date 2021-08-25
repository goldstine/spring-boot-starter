package org.goldstine.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建一个注解，所有加上@MyLog注解的类，成员变量，成员方法，局部参数变量等等都被拦截
 *
 */
@Target(ElementType.METHOD)//该注解放在方法上
@Retention(RetentionPolicy.RUNTIME)//表示该注解在运行时发生作用
public @interface MyLog {
    /**
     * 方法描述
     */
    String desc() default "";
}
