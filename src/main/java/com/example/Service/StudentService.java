package com.example.Service;


import com.example.com.domain.Student;
import org.springframework.stereotype.Repository;


public interface StudentService {


    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}

