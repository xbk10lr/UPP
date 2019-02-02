package com.upp.dao.mapper;

import com.upp.dto.generate.Transexceptionreg;
import com.upp.dto.generate.TransexceptionregExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TransexceptionregMapper {
    long countByExample(TransexceptionregExample example);

    int deleteByExample(TransexceptionregExample example);

    int deleteByPrimaryKey(String exceppseqnbr);

    int insert(Transexceptionreg record);

    int insertSelective(Transexceptionreg record);

    List<Transexceptionreg> selectByExample(TransexceptionregExample example);

    Transexceptionreg selectByPrimaryKey(String exceppseqnbr);

    int updateByExampleSelective(@Param("record") Transexceptionreg record, @Param("example") TransexceptionregExample example);

    int updateByExample(@Param("record") Transexceptionreg record, @Param("example") TransexceptionregExample example);

    int updateByPrimaryKeySelective(Transexceptionreg record);

    int updateByPrimaryKey(Transexceptionreg record);
    
    //自定义方法
    List<Transexceptionreg> selectOuttimeException(Integer beforequeryminute);
}