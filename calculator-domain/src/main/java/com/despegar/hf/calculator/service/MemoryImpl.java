package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class MemoryImpl
    implements Memory {
    BigDecimal valueStored = null;

    public void clear() {
        this.valueStored = null;
    }

    public BigDecimal read() {
        return this.valueStored;
    }

    public void store(BigDecimal value) {
        this.valueStored = value;
    }

}
