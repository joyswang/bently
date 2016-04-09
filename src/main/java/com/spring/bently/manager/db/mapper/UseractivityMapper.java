package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Useractivity;
import com.spring.bently.manager.db.model.UseractivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UseractivityMapper extends Mapper<Useractivity> {
    int countByExample(UseractivityExample example);

    int deleteByExample(UseractivityExample example);

    List<Useractivity> selectByExampleWithBLOBs(UseractivityExample example);

    List<Useractivity> selectByExample(UseractivityExample example);

    int updateByExampleSelective(@Param("record") Useractivity record, @Param("example") UseractivityExample example);

    int updateByExampleWithBLOBs(@Param("record") Useractivity record, @Param("example") UseractivityExample example);

    int updateByExample(@Param("record") Useractivity record, @Param("example") UseractivityExample example);
}