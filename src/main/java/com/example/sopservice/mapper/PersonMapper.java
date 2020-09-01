package com.example.sopservice.mapper;

import com.example.sopservice.entity.Person;
import com.gitee.fastmybatis.core.mapper.CrudMapper;

import java.util.List;

public interface PersonMapper extends CrudMapper<Person,Long> {

    List<Person> findByCondition(Person person);
}
