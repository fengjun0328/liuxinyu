package cn.bdqn.service.service.impl;

import cn.bdqn.dao.UsersMapper;
import cn.bdqn.pojo.Users;
import cn.bdqn.service.UsersService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Users> findLoad() {
        return usersMapper.findLoad();
    }
}
