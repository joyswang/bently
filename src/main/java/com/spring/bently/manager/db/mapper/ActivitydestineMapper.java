package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Activitydestine;
import com.spring.bently.manager.db.model.ActivitydestineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ActivitydestineMapper extends Mapper<Activitydestine> {
    int countByExample(ActivitydestineExample example);

    int deleteByExample(ActivitydestineExample example);

    List<Activitydestine> selectByExample(ActivitydestineExample example);

    int updateByExampleSelective(@Param("record") Activitydestine record, @Param("example") ActivitydestineExample example);

    int updateByExample(@Param("record") Activitydestine record, @Param("example") ActivitydestineExample example);
}