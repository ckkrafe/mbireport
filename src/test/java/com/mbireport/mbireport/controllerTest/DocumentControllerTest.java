package com.mbireport.mbireport.controllerTest;

import com.mbireport.mbireport.DTO.MbiReportDTO;
import com.mbireport.mbireport.controller.DocumentController;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.xmlbeans.ResourceLoader;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Mock
private ResourceLoader resourceLoader;

@Mock
private Resource resource;

@Mock
private HttpServletResponse response;

@InjectMocks
private DocumentController documentController;

@Nested
class DocumentControllerTest {
    @Test
    void generateDocument_withValidInput_generatesDocument() throws Exception {
        MbiReportDTO mbiReportDTO = new MbiReportDTO();
        mbiReportDTO.setText("Sample Text");

        InputStream templateStream = getClass().getResourceAsStream("/MBIS_Report_Template.docx");
        when(resourceLoader.getResource("classpath:MBIS_Report_Template.docx")).thenReturn(resource);
        when(resource.getInputStream()).thenReturn(templateStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        when(response.getOutputStream()).thenReturn(outputStream);

        documentController.generateDocument(mbiReportDTO, response);

        XWPFDocument document = new XWPFDocument(new ByteArrayInputStream(outputStream.toByteArray()));
        String documentText = document.getParagraphs().get(0).getText();
        assertEquals("Sample Text", documentText);
    }
}
