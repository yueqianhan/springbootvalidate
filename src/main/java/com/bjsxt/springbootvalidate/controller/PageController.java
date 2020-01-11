package com.bjsxt.springbootvalidate.controller;

import com.bjsxt.springbootvalidate.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hanyueqian
 * @date 2020/1/11 0011-下午 16:30
 */
@Controller
public class PageController
{

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, @ModelAttribute("ss") User user)
    {
        return page;
    }
}
