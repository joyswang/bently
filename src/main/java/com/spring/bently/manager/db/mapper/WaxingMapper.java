package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Waxing;
import com.spring.bently.manager.db.model.WaxingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WaxingMapper extends Mapper<Waxing> {
    int countByExample(WaxingExample example);

    int deleteByExample(WaxingExample example);

    List<Waxing> selectByExample(WaxingExample example);

    int updateByExampleSelective(@Param("record") Waxing record, @Param("example") WaxingExample example);

    int updateByExample(@Param("record") Waxing record, @Param("example") WaxingExample example);
}