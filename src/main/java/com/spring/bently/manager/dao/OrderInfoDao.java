package com.spring.bently.manager.dao;

import com.spring.bently.manager.model.OrderInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wgq on 16-4-24.
 */
public interface OrderInfoDao extends CrudRepository<OrderInfo, Long> {
}
