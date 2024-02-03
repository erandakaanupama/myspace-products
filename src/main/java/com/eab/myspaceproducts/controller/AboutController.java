package com.eab.myspaceproducts.controller;

import com.eab.myspaceproducts.dto.ProductContactInformationDto;
import com.eab.myspaceproducts.service.AboutInformationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/about")
public class AboutController {
    private AboutInformationService aboutInformationService;

    @GetMapping("/")
    public ResponseEntity<ProductContactInformationDto> getAboutInformation() {
        return ResponseEntity.status(HttpStatus.OK).body(aboutInformationService.getAboutInformation());
    }
}
