package com.ujiuye.dao;

import com.ujiuye.bean.Mobile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MobileDao {

    public Mobile getMobile(@Param("num") String num);

}
