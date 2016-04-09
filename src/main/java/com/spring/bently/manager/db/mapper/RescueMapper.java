package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Rescue;
import com.spring.bently.manager.db.model.RescueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RescueMapper extends Mapper<Rescue> {
    int countByExample(RescueExample example);

    int deleteByExample(RescueExample example);

    List<Rescue> selectByExample(RescueExample example);

    int updateByExampleSelective(@Param("record") Rescue record, @Param("example") RescueExample example);

    int updateByExample(@Param("record") Rescue record, @Param("example") RescueExample example);
}