package cn.seanjian.haigou.web.controller;

import cn.seanjian.haigou.util.AjaxResult;
import cn.seanjian.haigou.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou.controller
 * @Date: 2019/3/26 18:19
 */
@RestController
@RequestMapping("/plat")
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if(user!=null && !StringUtils.isEmpty(user.getName()) && !StringUtils.isEmpty(user.getPassword())){
            if("admin".equals(user.getName()) && "seanjian".equals(user.getPassword())){
                return AjaxResult.me().setMsg("恭喜登录成功！");
            }else{
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
