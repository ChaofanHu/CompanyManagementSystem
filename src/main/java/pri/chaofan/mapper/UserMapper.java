package pri.chaofan.mapper;

import org.apache.ibatis.annotations.Param;
import pri.chaofan.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser(@Param("username") String username, @Param("password") String password);

}
