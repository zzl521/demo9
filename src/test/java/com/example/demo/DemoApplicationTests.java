package com.example.demo;

import com.example.Service.s.StudentServiceImpl;
import com.example.com.domain.Student;
import com.example.com.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    static StudentMapper studentMapper;
    public static void main(String[] args) {
       StudentServiceImpl student=new StudentServiceImpl();
        Map<Object,Object>map=new HashMap<Object, Object>();
        Student list=studentMapper.selectByPrimaryKey(1);
        String.valueOf(list);
        System.out.println(list);

    }
}
