package com.backend.rootly.config;

import com.backend.rootly.domain.ExplorePlacesRequest;
import com.backend.rootly.dto.request.ExplorePlacesRequestDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MapperConfiguration {

    @Bean
    // ModelMapper exposes matching settings through its configuration object.
    @SuppressWarnings("PMD.LawOfDemeter")
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.createTypeMap(ExplorePlacesRequestDTO.class, ExplorePlacesRequest.class);
        modelMapper.validate();
        return modelMapper;
    }
}
