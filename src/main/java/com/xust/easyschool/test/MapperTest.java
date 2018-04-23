package com.xust.easyschool.test;


import com.xust.easyschool.bean.comsumer;
import com.xust.easyschool.dao.comsumerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试dao层
 * @author hmm
 * Spring项目使用Spring单元测试，自动注入需要的组件
 * 1.导入 SpringTest模块
 * 2.@ContextConfigurtion 指定配置文件的位置
 * 3.直接autowired要使用的组件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    comsumerMapper comsumerMapper;
    /**
     * 测试login
     */
   @Test
    public void test(){
       /*//1.创建ioc容器
       ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
       //2.从容器中获取mapper
       comsumerMapper bean=ioc.getBean(comsumerMapper.class);*/
       System.out.println(comsumerMapper);
   }
}
