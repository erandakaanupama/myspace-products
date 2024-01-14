package com.eab.myspaceproducts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getVersion() {
        return new ResponseEntity<>("0.0.1", HttpStatus.OK);
    }
}
