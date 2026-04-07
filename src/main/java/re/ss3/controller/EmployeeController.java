package re.ss3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import re.ss3.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    public String getAllEmployees(Model model) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Nguyen Van A", "Phong Dao tao", 12000));
        employees.add(new Employee(2, "Tran Thi B", "Phong Dao tao", 8500));
        employees.add(new Employee(3, "Le Van C", "Phong Dao tao", 15000));

        model.addAttribute("employees", employees);

        return "employee-list";
    }
}