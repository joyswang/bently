package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Hoteldestine;
import com.spring.bently.manager.db.model.HoteldestineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HoteldestineMapper extends Mapper<Hoteldestine> {
    int countByExample(HoteldestineExample example);

    int deleteByExample(HoteldestineExample example);

    List<Hoteldestine> selectByExample(HoteldestineExample example);

    int updateByExampleSelective(@Param("record") Hoteldestine record, @Param("example") HoteldestineExample example);

    int updateByExample(@Param("record") Hoteldestine record, @Param("example") HoteldestineExample example);
}