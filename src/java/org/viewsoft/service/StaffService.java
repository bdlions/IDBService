package org.viewsoft.service;

import com.viewsoft.db.collections.StaffDAO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author noor
 */
@RestController
@RequestMapping("/staffservice")
public class StaffService {
    @RequestMapping("/addstaff")
    public String addStaff(@RequestParam String additionalData) {
        com.viewsoft.service.StaffService staffService = new com.viewsoft.service.StaffService();
        String response = staffService.addStaff(additionalData);
        return response;
    }
    @RequestMapping("/getallstaffs")
    public List<StaffDAO> getAllStaffs() {
        com.viewsoft.service.StaffService staffService = new com.viewsoft.service.StaffService();
        return staffService.getAllStaffs();
    }
    
    
}
