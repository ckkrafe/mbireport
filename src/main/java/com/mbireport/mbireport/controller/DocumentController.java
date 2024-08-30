package com.mbireport.mbireport.controller;

import com.mbireport.mbireport.DTO.MbiReportDTO;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DocumentController {
    public void generateDocument(@RequestBody MbiReportDTO mbiReportDTO, HttpServletResponse response) throws IOException {
        FileInputStream template = new FileInputStream("./resource/MBIS_Report_Template.docx");
        XWPFDocument document = new XWPFDocument(template);

        for (XWPFParagraph paragraph : document.getParagraphs()) {
            for (XWPFRun run : paragraph.getRuns()) {
                String text = run.getText(0);
                if (text != null) {
                    text = text.replace("{buildingName}", buildingName);
                    text = text.replace("{address}", address);
                    run.setText(text, 0);
                }
            }
        }

        response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        response.setHeader("Content-Disposition", "attachment; filename=generated.docx");

        OutputStream out = response.getOutputStream();
        document.write(out);
        out.close();
        document.close();
    }
}
