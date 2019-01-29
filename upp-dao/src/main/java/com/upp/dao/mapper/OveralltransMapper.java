package com.upp.dao.mapper;

import com.upp.dto.generate.Overalltrans;
import com.upp.dto.generate.OveralltransExample;
import com.upp.dto.generate.OveralltransKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OveralltransMapper {
    long countByExample(OveralltransExample example);

    int deleteByExample(OveralltransExample example);

    int deleteByPrimaryKey(OveralltransKey key);

    int insert(Overalltrans record);

    int insertSelective(Overalltrans record);

    List<Overalltrans> selectByExample(OveralltransExample example);

    Overalltrans selectByPrimaryKey(OveralltransKey key);

    int updateByExampleSelective(@Param("record") Overalltrans record, @Param("example") OveralltransExample example);

    int updateByExample(@Param("record") Overalltrans record, @Param("example") OveralltransExample example);

    int updateByPrimaryKeySelective(Overalltrans record);

    int updateByPrimaryKey(Overalltrans record);
}