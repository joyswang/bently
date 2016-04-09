package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Yachtdestine;
import com.spring.bently.manager.db.model.YachtdestineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface YachtdestineMapper extends Mapper<Yachtdestine> {
    int countByExample(YachtdestineExample example);

    int deleteByExample(YachtdestineExample example);

    List<Yachtdestine> selectByExample(YachtdestineExample example);

    int updateByExampleSelective(@Param("record") Yachtdestine record, @Param("example") YachtdestineExample example);

    int updateByExample(@Param("record") Yachtdestine record, @Param("example") YachtdestineExample example);
}