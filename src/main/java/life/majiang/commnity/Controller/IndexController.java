package life.majiang.commnity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gengbiao on 2019/8/30.
 */
@Controller
//public class IndexController {
//    @GetMapping("/hello")
//    public String hello(@RequestParam(name = "name") String name, Model model){
//        model.addAttribute("name",name);
//        return "index";
//    }
//}
public class IndexController {
    @GetMapping("/")
    public String index(){

        return "index";
    }
}