package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Clubprofile;
import com.spring.bently.manager.db.model.ClubprofileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClubprofileMapper extends Mapper<Clubprofile> {
    int countByExample(ClubprofileExample example);

    int deleteByExample(ClubprofileExample example);

    List<Clubprofile> selectByExampleWithBLOBs(ClubprofileExample example);

    List<Clubprofile> selectByExample(ClubprofileExample example);

    int updateByExampleSelective(@Param("record") Clubprofile record, @Param("example") ClubprofileExample example);

    int updateByExampleWithBLOBs(@Param("record") Clubprofile record, @Param("example") ClubprofileExample example);

    int updateByExample(@Param("record") Clubprofile record, @Param("example") ClubprofileExample example);
}