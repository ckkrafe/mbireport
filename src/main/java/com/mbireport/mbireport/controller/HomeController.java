package com.mbireport.mbireport.controller;

import com.mbireport.mbireport.DTO.MbiReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController

public class HomeController {

    @Autowired
    private DocumentController documentController;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/generate")
    public void generateDocument(@RequestBody MbiReportDTO mbiReportDTO,
                                 HttpServletResponse response) throws IOException {
        documentController.generateDocument(mbiReportDTO, response);
    }
}
