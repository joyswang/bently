package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Activitysign;
import com.spring.bently.manager.db.model.ActivitysignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ActivitysignMapper extends Mapper<Activitysign> {
    int countByExample(ActivitysignExample example);

    int deleteByExample(ActivitysignExample example);

    List<Activitysign> selectByExample(ActivitysignExample example);

    int updateByExampleSelective(@Param("record") Activitysign record, @Param("example") ActivitysignExample example);

    int updateByExample(@Param("record") Activitysign record, @Param("example") ActivitysignExample example);
}