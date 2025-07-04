package com.createq.summerpracticetest.controller;

import com.createq.summerpracticetest.facades.SchoolFacade;
import com.createq.summerpracticetest.facades.StudentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {

    private final SchoolFacade schoolFacade;

    @Autowired
    public SchoolController(SchoolFacade schoolFacade) {
        this.schoolFacade = schoolFacade;
    }

    @GetMapping("allSchools")
    public String getAll(Model model){

        schoolFacade.getAll();
        model.addAttribute("allSchools", schoolFacade.getAll());

        return "allSchools";
    }
}

