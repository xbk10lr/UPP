package com.upp.dao.mapper;

import com.upp.dto.generate.Uppersysinfo;
import com.upp.dto.generate.UppersysinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UppersysinfoMapper {
    long countByExample(UppersysinfoExample example);

    int deleteByExample(UppersysinfoExample example);

    int deleteByPrimaryKey(String systemcode);

    int insert(Uppersysinfo record);

    int insertSelective(Uppersysinfo record);

    List<Uppersysinfo> selectByExample(UppersysinfoExample example);

    Uppersysinfo selectByPrimaryKey(String systemcode);

    int updateByExampleSelective(@Param("record") Uppersysinfo record, @Param("example") UppersysinfoExample example);

    int updateByExample(@Param("record") Uppersysinfo record, @Param("example") UppersysinfoExample example);

    int updateByPrimaryKeySelective(Uppersysinfo record);

    int updateByPrimaryKey(Uppersysinfo record);
}