package com.bjsxt.springbootvalidate.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

/**
 * @author hanyueqian
 * @date 2020/1/11 0011-下午 20:06
 */
@Configuration
public class ControllerException implements HandlerExceptionResolver
{
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)
    {
        ModelAndView mv =new ModelAndView();
        if(e instanceof ConstraintViolationException)
        {
            mv.setViewName("findUser");
        }
        mv.addObject("error",e.getMessage().split(":")[1]);
        return mv;
    }
}
