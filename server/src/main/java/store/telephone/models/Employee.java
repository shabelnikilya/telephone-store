package store.telephone.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private int id;
    private String name;
    private String surName;
    private String patronymic;
    private int age;
    private Position position;
}
