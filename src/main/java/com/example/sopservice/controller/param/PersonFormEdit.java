package com.example.sopservice.controller.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PersonFormEdit extends  PersonForm {

    @NotEmpty(message = "id不可为空")
    private Long id;
}
