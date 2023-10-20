package com.example.homework2_2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping("/plus")
    public String calculatorPlus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatorMinus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }
}
