package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class CalculatorImpl
    implements Calculator {
    Memory memory;

    public BigDecimal add(BigDecimal t1, BigDecimal t2) {
        return t1.add(t2);
    }

    public BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        return t1.subtract(t2);
    }

    public BigDecimal divide(BigDecimal t1, BigDecimal t2) {
        return t1.divide(t2);
    }

    public BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        return t1.multiply(t2);
    }

    public void memoryClear() {
        this.memory.clear();
    }

    public BigDecimal memoryRead() {
        return this.memory.read();
    }

    public void memoryStore(BigDecimal value) {
        this.memory.store(value);
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }


    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        MemoryImpl memory = new MemoryImpl();
        calculator.setMemory(memory);
        BigDecimal result = calculator.multiply(new BigDecimal(5), new BigDecimal(10));
        System.out.println(result);
        calculator.memoryStore(new BigDecimal(15));
        System.out.println();
        BigDecimal result2 = calculator.memoryRead();
        System.out.println(result2);
        System.out.println();
        calculator.memoryClear();
        BigDecimal result3 = calculator.memoryRead();
        System.out.println("La memoria guarda " + result3);
    }
}
