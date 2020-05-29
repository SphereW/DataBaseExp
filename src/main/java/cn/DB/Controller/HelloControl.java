package cn.DB.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {
    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "HelloWorld";
    }
}
