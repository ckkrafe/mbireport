package com.mbireport.mbireport.service;

import com.mbireport.mbireport.dto.ReportObjectDto;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ReportServiceImpl implements ReportService {

    @Override
    public ReportObjectDto searchReport() {
        ReportObjectDto rod = new ReportObjectDto();
        return rod;
    }

    @Override
    public ReportObjectDto createReport() {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
        return null;
    }
}
