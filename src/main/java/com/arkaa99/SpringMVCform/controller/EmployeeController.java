package com.arkaa99.SpringMVCform.controller;

import com.arkaa99.SpringMVCform.entity.Employee;
import com.arkaa99.SpringMVCform.service.EmployeeService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
        private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/processForm" , method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees/list";
    }
    @RequestMapping("/update")
    public String formUpdate(@RequestParam("ID") Integer ID, Model model) {
        Employee employee = employeeService.findById(ID).get();
        model.addAttribute("employee",employee);
        return "employee-form";
    }
    @GetMapping("/showform")
    public String showForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-form";
    }

    @GetMapping("/list")
    public String listEmployee(Model model) {

        List<Employee> employees = employeeService.findAll();

        model.addAttribute("employees",employees);
        return "employees-list";
    }
}
