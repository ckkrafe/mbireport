package com.mbireport.mbireport.controller;

import com.mbireport.mbireport.dto.ReportObjectDto;
import com.mbireport.mbireport.service.ReportService;
import com.mbireport.mbireport.service.ReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeController {
    @Autowired
    ReportService reportService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/create")
    public String create(Model model){

        ReportObjectDto report = new ReportObjectDto(reportService.createReport());
        model.addAttribute("report",report);
        return "create";
    }

    @GetMapping("/create")
    public String getcreate(Model model){

        return "create";
    }

    @GetMapping("/search")
    public String search(){

        return "search";
    }
    @PostMapping("/search")
    public String searchReport(Model model){
        ReportObjectDto reportObjectDto = reportService.searchReport();
        return "search";
    }
}
