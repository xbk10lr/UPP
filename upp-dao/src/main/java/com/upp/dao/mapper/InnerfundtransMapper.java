package com.upp.dao.mapper;

import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.InnerfundtransExample;
import com.upp.dto.generate.InnerfundtransKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InnerfundtransMapper {
    long countByExample(InnerfundtransExample example);

    int deleteByExample(InnerfundtransExample example);

    int deleteByPrimaryKey(InnerfundtransKey key);

    int insert(Innerfundtrans record);

    int insertSelective(Innerfundtrans record);

    List<Innerfundtrans> selectByExample(InnerfundtransExample example);

    Innerfundtrans selectByPrimaryKey(InnerfundtransKey key);

    int updateByExampleSelective(@Param("record") Innerfundtrans record, @Param("example") InnerfundtransExample example);

    int updateByExample(@Param("record") Innerfundtrans record, @Param("example") InnerfundtransExample example);

    int updateByPrimaryKeySelective(Innerfundtrans record);

    int updateByPrimaryKey(Innerfundtrans record);
}