package bid.blog521313.hzx.module1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {

    @RequestMapping({"", "/", "/index"})
    public String index () {
        return "index";
    }
}
