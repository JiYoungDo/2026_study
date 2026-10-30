package com.carridos.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    /**
     * computer 는 product 이다. (IS-A) */

    private String cpu;
    private int ssd;
    private int ram;

    private String operationSystem;

    public Computer(String cpu, int ssd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int ssd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }
}
