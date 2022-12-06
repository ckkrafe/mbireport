package com.mbireport.mbireport.dto;

import com.mbireport.mbireport.entity.ReportSectionOne;

import java.util.Date;

public class ReportObjectDto {
    private String buildingName;
    private String address;
    private String noticeno;
    private String refno;
    private Date date;
    private Date time;
    private ReportSectionOneDto reportSectionOneDto;

    public ReportObjectDto(ReportObjectDto report) {
        //todo
        return null;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoticeno() {
        return noticeno;
    }

    public void setNoticeno(String noticeno) {
        this.noticeno = noticeno;
    }

    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public ReportSectionOneDto getReportSectionOneDto() {
        return reportSectionOneDto;
    }

    public void setReportSectionOneDto(ReportSectionOneDto reportSectionOneDto) {
        this.reportSectionOneDto = reportSectionOneDto;
    }

    @Override
    public String toString() {
        return "ReportObjectDto{" +
                "buildingName='" + buildingName + '\'' +
                ", address='" + address + '\'' +
                ", noticeno='" + noticeno + '\'' +
                ", refno='" + refno + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", reportSectionOneDto=" + reportSectionOneDto +
                '}';
    }
}
