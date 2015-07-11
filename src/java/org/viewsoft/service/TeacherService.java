package org.viewsoft.service;

import com.viewsoft.db.collections.TeacherDAO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author noor
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
    public List<TeacherDAO> getAllTeachers() {
        com.viewsoft.service.TeacherService teacherService = new com.viewsoft.service.TeacherService();
        return teacherService.getAllTeachers();
    }
    
    
}
