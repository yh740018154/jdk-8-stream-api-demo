package cn.com.yangheng.controller;

import cn.com.yangheng.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author yangheng
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/10/11 9:04
 * @group smart video north
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/addStudent")
    public String addStudent(@Valid Student student) {
        System.out.println(student.toString());
        return "success";
    }
}
