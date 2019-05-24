package bid.blog521313.hzx.module1.service;

import bid.blog521313.hzx.module1.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzx
 * @since 2019-05-06
 */
public interface IPostService extends IService<Post> {
    Post get(long id);

    boolean update(Post post);

    boolean delete(long id);

    void initIndexWeekRank();

    void zUnionAndStoreLast7DaysForLastWeekRank();

    void incrZsetValueAndUnionForLastWeekRank(Long postId);
}
