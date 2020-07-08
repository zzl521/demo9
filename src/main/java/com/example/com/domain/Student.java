package com.example.com.domain;

import lombok.Data;

@Data
public class Student {
    private Integer id;

    private String name;

    private String sex;

    private String phone;

    private String klass;

    private String age;

    public Student(Integer i, String s, String s1, String s2, String s3, String s4) {
        this.id=i;
        this.name=s;
        this.sex=s1;
        this.phone=s2;
        this.klass=s3;
        this.age=s4;
    }
}