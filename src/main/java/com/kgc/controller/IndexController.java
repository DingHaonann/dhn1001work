package com.kgc.controller;

import com.kgc.pojo.Meetingroom;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 */
@Controller
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Meetingroom> selall = indexService.selall();
        model.addAttribute("list", selall);
        return "index";
    }

    @RequestMapping("/add")
    public String add(Meetingroom meetingroom, HttpSession session) {
        int add = indexService.add(meetingroom);
        if (add > 0) {
            session.setAttribute("msg", "会议室预定成功");
        } else {
            session.setAttribute("msg", "会议室预定失败");
        }
        return "redirect:/";
    }
}
