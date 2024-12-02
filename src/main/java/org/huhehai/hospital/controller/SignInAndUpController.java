package org.huhehai.hospital.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.huhehai.hospital.entity.User;
import org.huhehai.hospital.service.UserService;
import org.huhehai.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController

public class SignInAndUpController {

    @Autowired
    private UserService userService;

    @PostMapping("sign")
    @ApiOperation(value = "正常登录", notes = "用户名和手机+密码登录")
/*    public String login(@RequestBody User user) {
        log.info("员工登录: （）" + user.toString());
        User u = userService.login(user);
        return u != null ? Result.success() : Result.error("用户名或密码错误");
    }*/
    public Result<User> SignIn(@RequestBody User user) {
        User u = userService.signIn(user);
        if (u != null) {
            return Result.success(u, "登录成功！");
        } else {
            return Result.error("123", "账号或密码错误！");
        }
    }

    @ApiOperation(value = "注册", notes = "手机号+密码+验证码注册新用户")
    public Result<User> SignUp(@RequestBody User newUser) {
        User user = userService.signUp(newUser);
        if (user != null) {
            return Result.success(user, "注册成功！");
        } else {
            return Result.error("456", "用户已存在！");
        }
    }

    @PostMapping("sign/ResetPassword")
    @ApiOperation(value = "重置密码", notes = "根据手机号+验证码重置密码")
    public Result<User> ResetPassword(@RequestBody User user) {
        User u = userService.resetPassword(user);
        if (u != null) {
            return Result.success(u, "密码重置成功！");
        } else {
            return Result.error("789", "密码重置失败！");
        }
    }
}
/*    @ApiOperation(value="短信验证码登录" , notes = "根据LoginComponent调用短信登录方法")
    @PostMapping("/message/login")*/

