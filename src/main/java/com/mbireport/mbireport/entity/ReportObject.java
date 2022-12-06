package com.mbireport.mbireport.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Date;
@EntityScan
@Data
public class ReportObject {
    private String buildingName;
    private String address;
    private String noticeno;
    private String refno;
    private Date date;
    private Date time;
    private ReportSectionOne reportSectionOne;
}
