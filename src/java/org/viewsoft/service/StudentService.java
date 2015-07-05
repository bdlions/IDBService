package org.viewsoft.service;

import com.viewsoft.db.collections.StudentDAO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/studentservice")
public class StudentService {
    @RequestMapping("/addstudent")
    public String addStudent(@RequestParam String additionalData) {
        com.viewsoft.service.StudentService studentService = new com.viewsoft.service.StudentService();
        String response = studentService.addStudent(additionalData);
        return response;
    }
    @RequestMapping("/getallstudents")
    public List<StudentDAO> getAllStudents() {
        com.viewsoft.service.StudentService studentService = new com.viewsoft.service.StudentService();
        return studentService.getAllStudents();
    }
    
    
}
