package com.pinsoecodec.RegisterLogin.EmployeeController;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {

        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
}
