package com.rxlearn;

import io.reactivex.Observable;

public class Runner {
    Observable<Producer> o = Observable.create(s -> {
        s.onNext(new Producer());
    });
    
    public void run() {
        o.subscribe(p -> p.start());
    }
}