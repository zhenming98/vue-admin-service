package yzm.example.vue.admin.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import yzm.example.vue.admin.service.entity.MandyIntegral;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author yangzm
 * @date 2022-03-04 22:50:57
 */
@Mapper
@Repository
public interface MandyIntegralMapper extends BaseMapper<MandyIntegral> {

}
