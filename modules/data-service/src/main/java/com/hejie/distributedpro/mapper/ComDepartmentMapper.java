package com.hejie.distributedpro.mapper;

import com.hejie.distributedpro.pojo.ComDepartmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComDepartmentMapper {

    @Select("select * from com_department")
    List<ComDepartmentEntity> selList();

    @Select(value = "select * from com_department order by cur_dep_no limit #{start},#{size}")
    List<ComDepartmentEntity> selByPage(int start, int size);
}
