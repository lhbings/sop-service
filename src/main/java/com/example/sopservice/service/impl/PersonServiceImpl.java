package com.example.sopservice.service.impl;
import com.example.sopservice.entity.Person;
import com.example.sopservice.mapper.PersonMapper;
import com.example.sopservice.service.PersonService;
import com.gitee.fastmybatis.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public void save(Person person) {
       personMapper.save(person);
    }

    @Override
    public int delete(List<Integer> ids)  {
        Query query = new Query();
        query.in("id", ids);
        List<Person> list = personMapper.list(query);
        return list.stream().mapToInt(item -> {
            item.setStatus(2);
            int update = personMapper.updateIgnoreNull(item);
            return update;
        }).sum();
    }

    @Override
    public int update(Person person)  {
        return personMapper.updateIgnoreNull(person);
    }

    @Override
    public Person getById(Long id)  {
        return personMapper.getById(id);
    }

    @Override
    public List<Person> getByCondition(Person person) {
      return personMapper.findByCondition(person);
    }
}
