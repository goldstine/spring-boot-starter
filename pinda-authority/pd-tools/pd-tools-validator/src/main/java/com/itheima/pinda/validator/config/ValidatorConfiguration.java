package com.itheima.pinda.validator.config;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * 验证器配置
 *
 * 前端校验：主要用于提高用户的体验
 * 后端校验：主要用于提高数据的安全性
 *
 * 使用hibernate-vaidate优势：
 *  验证逻辑与业务逻辑之间进行分离，降低了程序耦合度
 *  统一且规范的验证方式，无序你再次编写重复的验证代码
 *  将更专注于你的业务，将繁琐的事情统统丢在一边
 *
 *
 * hibernate-calidator提供的校验方式为在类的属性上加入相应的注解来达到检验的目的
 * hibernate-validator提供的校验注解如下所示：
 * @AssertTrue  用于boolean字段，该字段只能为true
 * @AssertFalse  用于boolean字段，该字段只能为false
 * @CreditCardNumber对信用卡号进行一个大致的验证
 * @DecimalMax 只能小于或等于该值
 * @DecimalMin 只能大于或等于该值
 * @Email检查是否是一个有效的email地址
 * @Future 检查该字段的日期是否是属于将来的日期
 * @Length(min=,max=)检查所属的字段长度是否在min和max之间，只能用于字符串
 * @Max  该字段的值只能小于或等于该值
 * @Min 该字段的值只能大于等于该值
 * @NotNull  不能为null
 * @NotBlank 不能为空，检查时会将空格忽略
 * @NotEmpty不能为空，这里的空是指空字符串
 * @Pattern(regex=) 被注释的元素必须符合指定的正则表达式
 * @URL(protocol=,host,port)检查是否是一个有效的URL,如果提供了protocol,host等，则该URL还需满足提供的条件
 *
 */
public class ValidatorConfiguration {

    @Bean
    public Validator validator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                //快速失败返回模式
                .addProperty("hibernate.validator.fail_fast", "true")
                .buildValidatorFactory();
        return validatorFactory.getValidator();
    }

    /**
     * Method:  开启快速返回
     * Description:
     * 如果参数校验有异常，直接抛异常，不会进入到 controller，使用全局异常拦截进行拦截
     * Author: liu kai
     * Date: 2018/7/12 17:33
     *
     * @param
     * @return org.springframework.validation.beanvalidation.MethodValidationPostProcessor
     */
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        MethodValidationPostProcessor postProcessor = new MethodValidationPostProcessor();
        /**设置validator模式为快速失败返回*/
        postProcessor.setValidator(validator());
        return postProcessor;
    }

/*    @Bean
    public IConstraintExtract constraintExtract() {
        return new DefaultConstraintExtractImpl(validator());
    }*/

    /*@Bean
    public FormValidatorController getFormValidatorController(RequestMappingHandlerMapping requestMappingHandlerMapping) {
        return new FormValidatorController(constraintExtract(), requestMappingHandlerMapping);
    }*/
}