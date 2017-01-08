//package com.yangqisport.framework.extintegration.weibo;
//
//import weibo4j.Users;
//import weibo4j.examples.oauth2.Log;
//import weibo4j.model.User;
//import weibo4j.model.WeiboException;
//import weibo4j.util.WeiboConfig;
//
//public class WeiBoTest {
//
//    public static void main(String[] args) {
//        String access_token = WeiboConfig.getValue("accessToken");
//        String uid = WeiboConfig.getValue("uid");
//        Users um = new Users(access_token);
//        try {
//            User user = um.showUserById(uid);
//            Log.logInfo(user.toString());
//        } catch (WeiboException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
