package com.example.dubbofacade.application;

import com.example.dubbocommon.resp.RespObject;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/16 8:59
 */
public interface UserApplication {

//    int insert();

    RespObject selectBy();

    int updateBy();

    int deleteBy();

}
