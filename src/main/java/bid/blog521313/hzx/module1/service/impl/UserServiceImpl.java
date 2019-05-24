package bid.blog521313.hzx.module1.service.impl;

import bid.blog521313.hzx.module1.entity.User;
import bid.blog521313.hzx.module1.mapper.UserMapper;
import bid.blog521313.hzx.module1.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hzx
 * @since 2019-05-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
