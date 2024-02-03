package com.eab.myspaceproducts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "products")
public record ProductContactInformationDto(String message, Map<String, String> contactDetails,
                                           List<String> onCallSupport) {
}
