package com.example.sopservice.controller;

import com.example.sopservice.controller.param.PersonFormAdd;
import com.example.sopservice.controller.param.PersonFormEdit;
import com.example.sopservice.entity.Person;
import com.example.sopservice.service.PersonService;
import com.gitee.easyopen.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("save")
    public String save(PersonFormAdd add) {
        Person person = new Person();
        CopyUtil.copyPropertiesIgnoreNull(add,person);
        person.setStatus(1);
        personService.save(person);
        return "success";
    }

    @RequestMapping("delete")
    public String delete(@NotEmpty Integer[] ids) {
        personService.delete(Arrays.asList(ids));
        return "success";
    }

    @RequestMapping("update")
    public String update(PersonFormEdit edit) {
        Person person = new Person();
        CopyUtil.copyPropertiesIgnoreNull(edit,person);
        personService.update(person);
        return "success";
    }

    @RequestMapping("get")
    public Person get(@NotEmpty Long id) {
        return personService.getById(id);
    }

    @RequestMapping("list")
    public List<Person> list(Person person) {
        return personService.getByCondition(person);
    }
}
