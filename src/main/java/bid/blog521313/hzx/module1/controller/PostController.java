package bid.blog521313.hzx.module1.controller;


import bid.blog521313.hzx.module1.common.Result;
import bid.blog521313.hzx.module1.entity.Post;
import bid.blog521313.hzx.module1.service.IPostService;
import bid.blog521313.hzx.module1.utils.RedisUtil;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hzx
 * @since 2019-05-06
 */
@RestController
@RequestMapping("/module1/post")
public class PostController extends BaseController {
    @Autowired
    IPostService postService;

    @Autowired
    RedissonClient redissonClient;

    @ResponseBody
    @RequestMapping("/post/{id:\\d*}")
    public Object view(@PathVariable Long id) {
        Post post = postService.get(id);
        return post;
    }
    @ResponseBody
    @GetMapping("/post/hots")
    public Result hotPost() {

        RedisUtil redisUtil = new RedisUtil();
        Set<ZSetOperations.TypedTuple> lastWeekRank = redisUtil.getZSetRank("last_week_rank", 0, 6);

        List<Map<String, Object>> hotPosts = new ArrayList<>();
        for (ZSetOperations.TypedTuple typedTuple : lastWeekRank) {

            Map<String, Object> map = new HashMap<>();
            map.put("comment_count", typedTuple.getScore());
            map.put("id", redisUtil.hget("rank_post_" + typedTuple.getValue(), "post:id"));
            map.put("title", redisUtil.hget("rank_post_" + typedTuple.getValue(), "post:title"));

            hotPosts.add(map);
        }

        return Result.succ(hotPosts);
    }
}
