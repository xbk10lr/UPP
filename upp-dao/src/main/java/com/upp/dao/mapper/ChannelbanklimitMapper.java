package com.upp.dao.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.upp.dto.generate.Channelbanklimit;
import com.upp.dto.generate.ChannelbanklimitExample;

public interface ChannelbanklimitMapper {
    long countByExample(ChannelbanklimitExample example);

    int deleteByExample(ChannelbanklimitExample example);

    int deleteByPrimaryKey(String id);

    int insert(Channelbanklimit record);

    int insertSelective(Channelbanklimit record);

    List<Channelbanklimit> selectByExample(ChannelbanklimitExample example);

    Channelbanklimit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Channelbanklimit record, @Param("example") ChannelbanklimitExample example);

    int updateByExample(@Param("record") Channelbanklimit record, @Param("example") ChannelbanklimitExample example);

    int updateByPrimaryKeySelective(Channelbanklimit record);

    int updateByPrimaryKey(Channelbanklimit record);
    
    List<Channelbanklimit> selectSupportBankLimit(@Param("bankcode")String bankcode, @Param("transamt")BigDecimal transamt, @Param("transtype")String transtype);
}