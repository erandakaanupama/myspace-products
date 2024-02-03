package com.eab.myspaceproducts.service.impl;

import com.eab.myspaceproducts.dto.ProductContactInformationDto;
import com.eab.myspaceproducts.service.AboutInformationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AboutInformationServiceImpl implements AboutInformationService {

    private ProductContactInformationDto productContactInformationDto;
    @Override
    public ProductContactInformationDto getAboutInformation() {
        return productContactInformationDto;
    }
}
