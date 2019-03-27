package cn.seanjian.haigou.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou.controller
 * @Date: 2019/3/26 17:38
 */
@RestController
@RequestMapping("/plat")
public class HaigouTestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Map<String,String> test(){
        Map<String,String> map =  new HashMap<>();
        map.put("test","孙程");
        return map;
    }
}
