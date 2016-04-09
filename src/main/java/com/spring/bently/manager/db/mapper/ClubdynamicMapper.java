package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Clubdynamic;
import com.spring.bently.manager.db.model.ClubdynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClubdynamicMapper extends Mapper<Clubdynamic> {
    int countByExample(ClubdynamicExample example);

    int deleteByExample(ClubdynamicExample example);

    List<Clubdynamic> selectByExampleWithBLOBs(ClubdynamicExample example);

    List<Clubdynamic> selectByExample(ClubdynamicExample example);

    int updateByExampleSelective(@Param("record") Clubdynamic record, @Param("example") ClubdynamicExample example);

    int updateByExampleWithBLOBs(@Param("record") Clubdynamic record, @Param("example") ClubdynamicExample example);

    int updateByExample(@Param("record") Clubdynamic record, @Param("example") ClubdynamicExample example);
}