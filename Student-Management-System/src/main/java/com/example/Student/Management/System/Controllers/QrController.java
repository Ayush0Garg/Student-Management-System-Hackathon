package com.example.Student.Management.System.Controllers;

import com.example.Student.Management.System.Services.QrService;
import com.google.zxing.WriterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/qr")
public class QrController {

    @Autowired
    private QrService qrCodeService;

    @GetMapping(value = "/generate", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQRCode() throws IOException, WriterException {
            UUID uuid = UUID.fromString(String.valueOf(UUID.randomUUID()));
            String Text = "http://localhost:8080/attendance/mark/{StudentID}/" + uuid;
            byte[] qrImage = qrCodeService.generateQRCodeImage(Text, 240, 240);
            return ResponseEntity.ok(qrImage);
    }

    //TODO Attendance mark

}
