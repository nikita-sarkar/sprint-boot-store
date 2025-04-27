package com.practice.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class UserNameDTO {

    private Long id;
    private String name;
}
