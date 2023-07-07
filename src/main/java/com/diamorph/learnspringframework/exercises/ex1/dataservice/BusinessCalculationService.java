package com.diamorph.learnspringframework.exercises.ex1.dataservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;

//    public BusinessCalculationService(@Qualifier("mySQLDataServiceQualifier") DataService dataService) {
//        this.dataService = dataService;
//    }

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
