package com.beyzaslan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    //Employee ekleme , çıkarma falan yapıyoruz

    private String id;
    private String firstName;
    private String lastName;

}
