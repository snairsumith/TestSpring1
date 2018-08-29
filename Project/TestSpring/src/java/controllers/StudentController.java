/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author minusbug
 */
@Controller
public class StudentController {
    @RequestMapping(value="/student",method = RequestMethod.GET)
    public ModelAndView student(ModelMap model){
        model.addAttribute("command",new Student());
        return new ModelAndView("student");
    }
    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute()Student student,ModelMap model){
       model.addAttribute("name",student.getName());
       model.addAttribute("age",student.getAge());
       
       return "result";
    }
}
