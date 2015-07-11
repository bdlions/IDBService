package org.viewsoft.service;

import com.viewsoft.db.collections.ManagingCommitteeDAO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author noor
 */
@RestController
@RequestMapping("/managingCommitteeservice")
public class ManagingCommitteeService {
    @RequestMapping("/addmanagingCommittee")
    public String addManagingCommittee(@RequestParam String additionalData) {
        com.viewsoft.service.ManagingCommitteeService managingCommitteeService = new com.viewsoft.service.ManagingCommitteeService();
        String response = managingCommitteeService.addManagingCommittee(additionalData);
        return response;
    }
    @RequestMapping("/getallmanagingCommittees")
    public List<ManagingCommitteeDAO> getAllManagingCommittees() {
        com.viewsoft.service.ManagingCommitteeService managingCommitteeService = new com.viewsoft.service.ManagingCommitteeService();
        return managingCommitteeService.getAllManagingCommittees();
    }
    
    
}
