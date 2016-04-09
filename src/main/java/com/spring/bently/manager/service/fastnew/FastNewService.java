/*
 * Create Author  : yong.zou
 * Create Date    : 2016-04-09
 * Project        : bently
 * File Name      : FastNewService.java
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */
package com.spring.bently.manager.service.fastnew;

import com.spring.bently.manager.dao.BaseDao;
import com.spring.bently.manager.db.mapper.ClubprofileMapper;
import com.spring.bently.manager.db.model.Clubprofile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:  <p>
 *
 * @author : yong.zou <p>
 * @version 1.0 2016-04-09
 * @since bently 1.0
 */
@Service
public class FastNewService {


    @Autowired
    private ClubprofileMapper clubprofileMapper;

    public Clubprofile queryClubprofile(){
        Clubprofile clubprofile = new Clubprofile();
        List<Clubprofile> list = clubprofileMapper.select(clubprofile);

        if(list == null || list.size()==0){
            return null;
        }
        clubprofile = list.get(0);
        return clubprofile;

    }

    public boolean addClubprofile(Clubprofile clubprofile){

        int result = clubprofileMapper.insert(clubprofile);

        return true;

    }

    public boolean updateClubprofile(Clubprofile clubprofile){
        int result = clubprofileMapper.updateByPrimaryKey(clubprofile);
        return true;
    }

}
