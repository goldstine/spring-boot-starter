package org.goldstine.log;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 自定义一个拦截器，继承自spring提供的拦截器适配器：HandlerInterceptorAdaptor
 */
public class MyLogInterceptor extends HandlerInterceptorAdapter {

    //通过ThreadLocal记录一下执行的时间，在方法执行之前和执行之后
    private static final ThreadLocal<Long> startTimeThreadLocal=new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在controller方法执行之前执行此方法

        //1、首先将Object类型的handler转为HandlerMethod
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        
        //2、通过handlerMethod
        Method method = handlerMethod.getMethod();//这里获得的是反射对象Method

        MyLog annotation = method.getAnnotation(MyLog.class);//通过反射对象获得方法上的注解  public 方法 使用了MyLog注解

        if(annotation!=null){
            //说明当前拦截到的方法上加入了MyLog注解
            long startTime = System.currentTimeMillis();
            startTimeThreadLocal.set(startTime);
        }


        return true;//不管是否拦截到方法，都会返回，所以直接返回true
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //在controller方法执行之后执行此方法
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //通过handlerMethod获得泛型对象
        Method method = handlerMethod.getMethod();
        //通过Method对象获得所有的注解
        MyLog annotation = method.getAnnotation(MyLog.class);

        if(annotation!=null){
            Long startTime = startTimeThreadLocal.get();
            long endTime = System.currentTimeMillis();
            Long optTime=(endTime-startTime);

            String requestURI = request.getRequestURI();

            String methodName = method.getDeclaringClass().getName() + "." + method.getName();

            String methodDesc = annotation.desc();

            System.out.println("请求的uri:"+requestURI);
            System.out.println("请求的方法名:"+methodName);
            System.out.println("方法描述："+methodDesc);
            System.out.println("方法执行时间："+optTime+"ms");

        }
        super.postHandle(request,response,handler,modelAndView);  //然后调用父类的方法，相当于装饰器设计模式
    }
}
