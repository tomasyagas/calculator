package com.despegar.hf.echo.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.despegar.hf.calculator.service.Calculator;

@Controller
public class CalculatorController {

    private Calculator calculatorService;

    // Put here all exposed operations via RequestMappings

    @RequestMapping(value = "/suma/{v1}/{v2}", method = RequestMethod.GET)
    public ResponseEntity<String> add(@PathVariable("v1") BigDecimal v1, @PathVariable("v2") BigDecimal v2) {
        BigDecimal result = this.calculatorService.add(v1, v2);
        return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
    }

    // lalalalala
    public Calculator getCalculatorService() {
        return this.calculatorService;
    }

    public void setCalculatorService(Calculator calculatorService) {
        this.calculatorService = calculatorService;
    }
}
