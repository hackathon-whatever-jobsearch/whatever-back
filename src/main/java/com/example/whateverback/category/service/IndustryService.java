package com.example.whateverback.category.service;

import com.example.whateverback.category.model.entity.Industry;
import com.example.whateverback.category.repository.IndustryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IndustryService {

    private final IndustryRepository industryRepository;

    public List<String> getIndustryList() {
        return industryRepository.findAllName();
    }

    public List<String> getIndustryListByMidName(String midName) {
        return industryRepository.findByMidName(midName).stream().map(Industry::getName).collect(Collectors.toList());
    }

    public String getIndustryMcdByMidName(String midName) {
        if (midName == null) return "";
        return industryRepository.findByMidName(midName).get(0).getIndMcd().toString();
    }

    public String getIndustryCdByMidName(String name) {
        if (name == null) return "";
        return industryRepository.findByName(name).get(0).getIndBcd().toString();
    }
}
