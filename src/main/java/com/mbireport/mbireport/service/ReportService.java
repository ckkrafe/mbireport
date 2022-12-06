package com.mbireport.mbireport.service;

import com.mbireport.mbireport.dto.ReportObjectDto;

public interface ReportService {
    ReportObjectDto searchReport();
    ReportObjectDto createReport();
}
