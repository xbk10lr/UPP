package com.upp.dao.mapper;

import com.upp.dto.generate.Notifyreg;
import com.upp.dto.generate.NotifyregExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NotifyregMapper {
    long countByExample(NotifyregExample example);

    int deleteByExample(NotifyregExample example);

    int deleteByPrimaryKey(String notifynbr);

    int insert(Notifyreg record);

    int insertSelective(Notifyreg record);

    List<Notifyreg> selectByExample(NotifyregExample example);

    Notifyreg selectByPrimaryKey(String notifynbr);

    int updateByExampleSelective(@Param("record") Notifyreg record, @Param("example") NotifyregExample example);

    int updateByExample(@Param("record") Notifyreg record, @Param("example") NotifyregExample example);

    int updateByPrimaryKeySelective(Notifyreg record);

    int updateByPrimaryKey(Notifyreg record);
}