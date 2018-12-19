package com.ujiuye.service.impl;

import com.ujiuye.bean.Mobile;
import com.ujiuye.dao.MobileDao;
import com.ujiuye.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    private MobileDao mobileDao;

    @Override
    public Mobile getMobile(String num) {
        if(num.length() > 7){
            num = num.substring(0,7);
        }
        return mobileDao.getMobile(num);
    }
}
