package com.spring.bently.manager.db.mapper;

import com.spring.bently.manager.db.model.Member;
import com.spring.bently.manager.db.model.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MemberMapper extends Mapper<Member> {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    List<Member> selectByExample(MemberExample example);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);
}