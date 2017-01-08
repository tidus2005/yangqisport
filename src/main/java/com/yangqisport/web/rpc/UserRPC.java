/**
 * 
 */
package com.yangqisport.web.rpc;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yangqisport.framework.auth.XAuthToken;
import com.yangqisport.framework.auth.XAuthTokenService;
import com.yangqisport.framework.web.controller.BaseController;
import com.yangqisport.service.UserService;
import com.yangqisport.service.domain.ActivityItemDO;
import com.yangqisport.service.domain.UserDO;
import com.yangqisport.web.vo.UserVO;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/api")
public class UserRPC extends BaseController {

    @Autowired
    private UserService       userService;

    @Autowired
    private XAuthTokenService xAuthTokenService;

    @RequestMapping("/test")
    public Object test(@RequestParam(value = "test") String test) throws UnknownHostException {

        InetAddress addr = InetAddress.getLocalHost();
        
        
        return String.format("test string is %s , current: %s , hostname: %s , hostaddress : %s" , test,
                String.valueOf(System.currentTimeMillis()), addr.getHostName(), addr.getHostAddress());
    }

    @RequestMapping("/register")
    public Object register(@RequestParam(value = "loginId") String loginId,
                           @RequestParam(value = "password") String password,
                           @RequestParam(value = "repassword") String repassword) {

        UserDO userDO = new UserDO();
        userDO = userService.register(loginId, password, repassword);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userDO, userVO);
        return userVO;
    }

    @RequestMapping("/auth/login")
    public Object login(@RequestParam(value = "authString") String authString,
                        @RequestParam(value = "platform") String platform) {

        UserDO userDO = userService.login(authString, platform, true);

        XAuthToken xAuthToken = null;
        if (userDO != null && userDO.getId() != null) {
            xAuthToken = xAuthTokenService.getTokenByUserId(String.valueOf(userDO.getId()));
        }
        return xAuthToken;
    }

    @RequestMapping(value = "/user/getUser", method = RequestMethod.GET)
    public Object getUser(@RequestParam(value = "userId") Long userId) {
        UserVO userVO = new UserVO();
        UserDO userDO = userService.getUserByUserId(userId);
        BeanUtils.copyProperties(userDO, userVO);
        return userVO;
    }

    @RequestMapping(value = "/user/settingUserInterestActivity", method = RequestMethod.POST)
    public Object settingUserInterestActivity(@ModelAttribute("aid") ActivityItemDO aid) {
        System.out.println(aid);
        //userService.settingUserInterestActivity(Long.parseLong(getUserId()), null);
        return aid;
    }
}
