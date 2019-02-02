package com.upp.dao.mapper;

import com.upp.dto.generate.Onlineorderinfo;
import com.upp.dto.generate.OnlineorderinfoExample;
import com.upp.dto.generate.OnlineorderinfoKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OnlineorderinfoMapper {
    long countByExample(OnlineorderinfoExample example);

    int deleteByExample(OnlineorderinfoExample example);

    int deleteByPrimaryKey(OnlineorderinfoKey key);

    int insert(Onlineorderinfo record);

    int insertSelective(Onlineorderinfo record);

    List<Onlineorderinfo> selectByExample(OnlineorderinfoExample example);

    Onlineorderinfo selectByPrimaryKey(OnlineorderinfoKey key);

    int updateByExampleSelective(@Param("record") Onlineorderinfo record, @Param("example") OnlineorderinfoExample example);

    int updateByExample(@Param("record") Onlineorderinfo record, @Param("example") OnlineorderinfoExample example);

    int updateByPrimaryKeySelective(Onlineorderinfo record);

    int updateByPrimaryKey(Onlineorderinfo record);
}