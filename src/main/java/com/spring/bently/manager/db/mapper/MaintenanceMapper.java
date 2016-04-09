package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Maintenance;
import com.spring.bently.manager.db.model.MaintenanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MaintenanceMapper extends Mapper<Maintenance> {
    int countByExample(MaintenanceExample example);

    int deleteByExample(MaintenanceExample example);

    List<Maintenance> selectByExample(MaintenanceExample example);

    int updateByExampleSelective(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);

    int updateByExample(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);
}