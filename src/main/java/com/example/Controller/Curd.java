package com.example.Controller;

import com.example.com.domain.Student;
import com.example.com.mapper.StudentMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Curd {
    @Resource

    private StudentMapper studentMapper;

    @RequestMapping("/delete")
    public int delete()
    {

     int a= studentMapper.deleteByPrimaryKey(1);

        return  a;
    }
    @RequestMapping("/select")
    public  String  select(){
        Student student;String string = null;
        for (Integer integer=1; integer<=5;integer++) {
            student = studentMapper.selectByPrimaryKey(integer);
            String improve=student+"";
            string+=improve;
        }
        return string;
    }
    @RequestMapping("/update")
    public int update(){
        int result=studentMapper.updateByPrimaryKey(new Student(10, "1","2","33","4","5"));

        return result;
    }
    @RequestMapping("/insert")
    public int  insert(){

        int result=studentMapper.insert(new Student(66,"1","2","3","4","5"));
        return result;
    }
}
