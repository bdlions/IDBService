package org.viewsoft.service;

import com.viewsoft.db.collections.GuardianDAO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author noor
 */
@RestController
@RequestMapping("/guardianservice")
public class GuardianService {
    @RequestMapping("/addguardian")
    public String addGuardian(@RequestParam String additionalData) {
        com.viewsoft.service.GuardianService guardianService = new com.viewsoft.service.GuardianService();
        String response = guardianService.addGuardian(additionalData);
        return response;
    }
    @RequestMapping("/getallguardians")
    public List<GuardianDAO> getAllGuardians() {
        com.viewsoft.service.GuardianService guardianService = new com.viewsoft.service.GuardianService();
        return guardianService.getAllGuardians();
    }
    
    
}
