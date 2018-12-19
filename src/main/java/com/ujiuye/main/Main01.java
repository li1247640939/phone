package com.ujiuye.main;

import com.ujiuye.bean.Mobile;
import com.ujiuye.dao.MobileDao;
import com.ujiuye.service.MobileService;
import com.ujiuye.test.MobileCodeWS;
import com.ujiuye.test.MobileCodeWSSoap;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml","spring-dao.xml");

        MobileService bean = context.getBean(MobileService.class);

        Mobile mobile = bean.getMobile("13406790920");
        System.out.println(mobile);


    }


}
