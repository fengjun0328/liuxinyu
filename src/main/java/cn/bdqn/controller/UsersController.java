package cn.bdqn.controller;

import cn.bdqn.pojo.Users;
import cn.bdqn.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping("/index.hmtl")
    public String index(Model model){
        Users user=usersService.findLoad().get(0);
        model.addAttribute("user",user);
        return "index";
    }
}
