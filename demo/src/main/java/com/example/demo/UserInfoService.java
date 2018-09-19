package com.example.demo;

import com.example.demo.entity.UserInfo;
import com.example.demo.reposiotry.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jerry zhang
 * @Description:
 * @Date Created in 2018-03-31 05:55
 * @Modified by :
 */
@Service
public class service {
    @Autowired
    UserInfoRepository userInfoRepository;
    public UserInfo findByUsername(String name) {
        return userInfoRepository.findByUsername(name);
    }
}
