package com.spring.bently.manager.dao;

import com.spring.bently.manager.model.AccessToken;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by wgq on 16-4-9.
 */
public interface AccessTokenDao extends CrudRepository<AccessToken, Long> {
    public List<AccessToken> findByType(String type) ;
}
