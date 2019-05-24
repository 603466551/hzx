package bid.blog521313.hzx.module1.service.impl;

import bid.blog521313.hzx.module1.entity.UserMessage;
import bid.blog521313.hzx.module1.mapper.UserMessageMapper;
import bid.blog521313.hzx.module1.service.IUserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hzx
 * @since 2019-05-07
 */
@Service
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements IUserMessageService {

}
