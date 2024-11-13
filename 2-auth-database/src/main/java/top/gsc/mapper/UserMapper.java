package top.gsc.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.gsc.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gsc
 * @since 2024-11-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
