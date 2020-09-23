package cn.itrip.service;

import cn.itrip.beans.pojo.User;
import cn.itrip.common.Page;

import java.util.List;

public interface UserService {

    /**
     * 分页查询用户
     * @param pageIndex
     * @param userName
     * @return
     */
    Page<User> getPagedUsers(int pageIndex,String userName);
}
