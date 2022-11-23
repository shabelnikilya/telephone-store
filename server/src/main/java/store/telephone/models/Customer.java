package store.telephone.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private int id;
    private String name;
    private String surName;
    private String patronymic;
    private int age;
    private String telephoneNumber;
    private String bonesCard;
    private List<ElectronicTechnology> electronicTechnologyList;
    private String email;
}
