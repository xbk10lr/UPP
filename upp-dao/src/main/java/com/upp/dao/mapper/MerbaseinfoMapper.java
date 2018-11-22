package com.upp.dao.mapper;

import com.upp.dto.generate.Merbaseinfo;
import com.upp.dto.generate.MerbaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerbaseinfoMapper {
    long countByExample(MerbaseinfoExample example);

    int deleteByExample(MerbaseinfoExample example);

    int deleteByPrimaryKey(String mernbr);

    int insert(Merbaseinfo record);

    int insertSelective(Merbaseinfo record);

    List<Merbaseinfo> selectByExample(MerbaseinfoExample example);

    Merbaseinfo selectByPrimaryKey(String mernbr);

    int updateByExampleSelective(@Param("record") Merbaseinfo record, @Param("example") MerbaseinfoExample example);

    int updateByExample(@Param("record") Merbaseinfo record, @Param("example") MerbaseinfoExample example);

    int updateByPrimaryKeySelective(Merbaseinfo record);

    int updateByPrimaryKey(Merbaseinfo record);
}