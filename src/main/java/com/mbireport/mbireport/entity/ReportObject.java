package com.mbireport.mbireport.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
@EntityScan
public class ReportObject {
    private String buildingName;
    private String address;
    private String noticeno;
    private String refno;
    private Date date;
    private Date time;
    private ReportSectionOne reportSectionOne;
}
