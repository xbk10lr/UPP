package com.upp.dao.mapper;

import com.upp.dto.generate.Fundtrans;
import com.upp.dto.generate.FundtransExample;
import com.upp.dto.generate.FundtransKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundtransMapper {
    long countByExample(FundtransExample example);

    int deleteByExample(FundtransExample example);

    int deleteByPrimaryKey(FundtransKey key);

    int insert(Fundtrans record);

    int insertSelective(Fundtrans record);

    List<Fundtrans> selectByExample(FundtransExample example);

    Fundtrans selectByPrimaryKey(FundtransKey key);

    int updateByExampleSelective(@Param("record") Fundtrans record, @Param("example") FundtransExample example);

    int updateByExample(@Param("record") Fundtrans record, @Param("example") FundtransExample example);

    int updateByPrimaryKeySelective(Fundtrans record);

    int updateByPrimaryKey(Fundtrans record);
}