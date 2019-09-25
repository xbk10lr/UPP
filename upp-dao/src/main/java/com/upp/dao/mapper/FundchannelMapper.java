package com.upp.dao.mapper;

import com.upp.dto.generate.Fundchannel;
import com.upp.dto.generate.FundchannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundchannelMapper {
    long countByExample(FundchannelExample example);

    int deleteByExample(FundchannelExample example);

    int deleteByPrimaryKey(String fundchannelcode);

    int insert(Fundchannel record);

    int insertSelective(Fundchannel record);

    List<Fundchannel> selectByExample(FundchannelExample example);

    Fundchannel selectByPrimaryKey(String fundchannelcode);

    int updateByExampleSelective(@Param("record") Fundchannel record, @Param("example") FundchannelExample example);

    int updateByExample(@Param("record") Fundchannel record, @Param("example") FundchannelExample example);

    int updateByPrimaryKeySelective(Fundchannel record);

    int updateByPrimaryKey(Fundchannel record);
}