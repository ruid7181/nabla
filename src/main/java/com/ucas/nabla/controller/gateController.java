package com.ucas.nabla.controller;

import com.ucas.nabla.entity.TmData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class gateController {

    @GetMapping("/to_upload")
    public String toGate(){
        return "file-upload";
    }
}
