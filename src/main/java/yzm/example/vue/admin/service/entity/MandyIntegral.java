package yzm.example.vue.admin.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import yzm.example.vue.admin.service.base.data.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yangzm
 * @date 2022-03-04 22:50:57
 */
@Data
@TableName("mandy_integral" )
@ApiModel(value = "MandyIntegral对象" , description = "" )
@EqualsAndHashCode(callSuper = true)
public class MandyIntegral extends BaseEntity {


    @TableId(value = "id" , type = IdType.AUTO)
    private Long id;


}


