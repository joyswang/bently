package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Washcar;
import com.spring.bently.manager.db.model.WashcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WashcarMapper extends Mapper<Washcar> {
    int countByExample(WashcarExample example);

    int deleteByExample(WashcarExample example);

    List<Washcar> selectByExample(WashcarExample example);

    int updateByExampleSelective(@Param("record") Washcar record, @Param("example") WashcarExample example);

    int updateByExample(@Param("record") Washcar record, @Param("example") WashcarExample example);
}