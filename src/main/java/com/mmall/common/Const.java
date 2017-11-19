package com.mmall.common;

/**
 * @author adXiang
 * @date 2017/11/19
 */
public class Const {

    //-Dfile.encoding=UTF-8
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";

    public static final String USERNAME = "username";

    public interface Role {
        /**
         * 普通用户
         */
        int ROLE_CUSTOMER = 0;

        /**
         * 管理员
         */
        int ROLE_ADMIN = 1;
    }

}
