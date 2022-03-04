package yzm.example.vue.admin.service.base.data;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author yzm
 * @date 2022/2/22 - 21:16
 */
public class BaseService<T, M extends BaseMapper<T>> extends ServiceImpl<M, T> {

    @Override
    public boolean save(T o) {
        boolean hasPrimaryKeyValue = false;
        List<Field> idFields = FieldUtils.getFieldsListWithAnnotation(o.getClass(), TableId.class);
        for (Field idField : idFields) {
            idField.setAccessible(true);
            try {
                Object idFieldValue = idField.get(o);
                if (idFieldValue != null) {
                    hasPrimaryKeyValue = true;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (hasPrimaryKeyValue) {
            super.updateById(o);
        } else {
            super.save(o);
        }
        return hasPrimaryKeyValue;
    }

}
