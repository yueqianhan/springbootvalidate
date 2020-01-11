package com.bjsxt.springbootvalidate.controller;

import com.bjsxt.springbootvalidate.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author hanyueqian
 * @date 2020/1/8 0008-下午 22:21
 */
@Controller
@RequestMapping("/user")
@Validated
public class UserController
{

    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute("ss") @Validated User user, BindingResult result)
    {
        if (result.hasErrors())
        {
            List<ObjectError> list =result.getAllErrors();
            for(ObjectError err:list)
            {
                FieldError fieldError =(FieldError) err;
                String fieldName = fieldError.getField();
                String msg = fieldError.getDefaultMessage();
                System.out.println(fieldName+"\t"+msg);
            }
            return "addUser";
        }
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/findUser")
    public String findUser(@NotBlank(message = "真实姓名不能为空") String realname)
    {
        System.out.println(realname);
        return "ok";
    }
}
