package com.itheima.pinda.j2cache;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;

/**
 * author:goldstine
 *
 * j2cache是OSChina目前正在使用的两级缓存框架
 * j2cache的两级缓存结构
 *      L1：进程内缓存 caffeine、ehcache
 *      L2:集中式缓存：redis memcached
 *
 *      j2cache其实并不是在重复造轮子，而是做资源整合，即将Ehcache,Caffeine,redis,Spring cache
 *      等进行整合，由与大量的缓存读取会导致L2的网络成为整个系统的瓶颈，因此L1的目标是降低对L2的读取次数
 *      该缓存架构主要用于集群环境，单机也可以使用，用于避免应用重启导致的ehcache缓存数据丢失
 *      j2cache从1.3.0版本开始支持JGroups和redis pub/sub  两种方式进行缓存时间通知
 *
 *      数据读取顺序--》L1--》L2-->DB
 *
 */

/**
 * 覆盖 SpringCache 相关配置
 */
public class MyCacheConfig extends CachingConfigurerSupport {
    /**
     * 解决注解：Cacheable 没有指定key时，会将key生成为 ${value}:SimpleKey []
     * eg： @Cacheable(value = "pinda") ->  pinda:SimpleKey []
     *
     * @return
     */
    @Override
    public KeyGenerator keyGenerator() {
        return (target, method, objects) -> {
//            StringBuilder sb = new StringBuilder();
//            sb.append(target.getClass().getName());
//            sb.append(StrPool.COLON);
//            sb.append(method.getName());
//            for (Object obj : objects) {
//                if (obj != null) {
//                    sb.append(StrPool.COLON);
//                    sb.append(obj.toString());
//                }
//            }
//            return sb.toString();
            return "";
        };
    }

}
