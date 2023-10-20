package com.example.homework2_2;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculatorPlus(Integer num1, Integer num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String calculatorMinus(Integer num1, Integer num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }

        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String calculatorMultiply(Integer num1, Integer num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String calculatorDivide(Integer num1, Integer num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        if (num2 == 0) {
            return "ОШИБКА!!! НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ!!!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    public String calculatorError(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            return "НЕ ХВАТАЕТ ДВУХ ПАРАМЕТРОВ !!!";
        }
        if (num1 == null) {
            return "НЕ ХВАТАЕТ ПЕРВОГО ПАРАМЕТРА !!!";
        }
        if (num2 == null) {
            return "НЕ ХВАТАЕТ ВТОРОГО ПАРАМЕТРА !!!";
        }
        return null;
    }
}