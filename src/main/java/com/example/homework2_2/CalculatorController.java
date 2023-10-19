package com.example.homework2_2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String calculator(@RequestParam int num1,@RequestParam int num2 ) {
        return  num1 +  " + " + num2 + " = " + (num1 + num2);
    }
}
