package org.viewsoft.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/teacherservice")
public class TeacherService {
    @RequestMapping("/addteacher")
    public String addTeacher(@RequestParam String additionalData) {
        
        com.viewsoft.service.TeacherService teacherService = new com.viewsoft.service.TeacherService();
        String response = teacherService.addTeacher(additionalData);
        return response;
    }
    @RequestMapping("/getallteachers")
    public String getAllTeachers() {
        
        com.viewsoft.service.TeacherService teacherService = new com.viewsoft.service.TeacherService();
        String response = teacherService.getAllTeachers();
        return response;
    }
    
    
}
