package com.zz.web.controller.api;

import com.zz.web.bean.UserInfoBean;
import com.zz.web.utils.WebHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lidongy
 * @version 10.0
 * Created by lidongy on 2020/10/17
 */
@Controller
@RequestMapping(value = "/login")
public class LoginResource {

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public void loginPage(HttpServletRequest req,
                          HttpServletResponse res) throws Exception {
        res.setHeader("Content-Type", "text/html;charset=UTF-8");
        res.getWriter().print(WebHelper.KEY.getResource("com/zz/web/html/login.html"));
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public boolean login(HttpServletRequest req,
                         HttpServletResponse res,
                         @RequestBody UserInfoBean userInfo) throws Exception {
        if (userInfo.getUserName().equals("123") && userInfo.getPassword().equals("456")) {
            return true;
        } else {
            return false;
        }
    }
}
