package com.ucas.nabla.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class upLoadController {

    @Value("${nabla.server_file_repository}")
    private String serverFileRepository;

    @PostMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile file) {
        try {
            System.out.println(serverFileRepository);
            file.transferTo(new File(serverFileRepository + "\\" + file.getOriginalFilename()));
        } catch (Exception e) {
            System.out.println("Fail to upload" + file.getOriginalFilename());
        }
    }
}
