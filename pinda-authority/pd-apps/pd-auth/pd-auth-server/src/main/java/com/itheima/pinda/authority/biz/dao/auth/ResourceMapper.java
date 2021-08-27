package com.itheima.pinda.authority.biz.dao.auth;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pinda.authority.dto.auth.ResourceQueryDTO;
import com.itheima.pinda.authority.entity.auth.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * <p>
 * Mapper 接口
 * 资源
 * </p>
 *
 * 如果涉及到数据库的多张表联合查询，所以应该编写对应的自定义查询映射文件mapper.xml文件
 *
 *
 */
@Repository
public interface ResourceMapper extends BaseMapper<Resource> {
    /**
     * 查询用户拥有的资源
     */
    List<Resource> findVisibleResource(ResourceQueryDTO resource);

    List<Long> findMenuIdByResourceId(@Param("resourceIdList") List<Long> resourceIdList);
}
