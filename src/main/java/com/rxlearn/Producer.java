package com.rxlearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer extends Thread {
    private Thread t;
    
    private final List<Long> l;
    
    private final Random r;
    
    public int timer = 20;
    
    public Producer() {
        l = new ArrayList<>();
        r = new Random();
    }
    
    @Override
    public void run() {
        while (timer >  0) {
           l.add(r.nextLong());
           timer--;
        }
        printValues();
    }
    
    @Override
    public void start() {
        if (t == null) {
            t = new Thread(this);
        }
        t.start();
    }
    
    public void printValues() {
        System.out.println(l);
    }
}