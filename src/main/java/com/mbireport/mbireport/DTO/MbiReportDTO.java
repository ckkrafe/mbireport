package com.mbireport.mbireport.DTO;

public class MbiReportDTO {
    private InspectUnitDTO inspectUnitDTO;
    private InspectionDetailDTO inspectionDetailDTO;

    public InspectUnitDTO getInspectUnitDTO() {
        return inspectUnitDTO;
    }

    public void setInspectUnitDTO(InspectUnitDTO inspectUnitDTO) {
        this.inspectUnitDTO = inspectUnitDTO;
    }

    public InspectionDetailDTO getInspectionDetailDTO() {
        return inspectionDetailDTO;
    }

    public void setInspectionDetailDTO(InspectionDetailDTO inspectionDetailDTO) {
        this.inspectionDetailDTO = inspectionDetailDTO;
    }

    @Override
    public String toString() {
        return "MbiReportDTO{" +
                "inspectUnitDTO=" + inspectUnitDTO +
                ", inspectionDetailDTO=" + inspectionDetailDTO +
                '}';
    }
}
