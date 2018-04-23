package com.xust.easyschool.dao;

import com.xust.easyschool.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.Serializable;

public class comsumerMapperTest extends BaseTest implements Serializable {
    @Resource
    comsumerMapper comsumerMapper;
    @Test
    public void test(){
        System.out.println(comsumerMapper);
    }
}
