package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MyService {
    private static MyService myService;
    private List<String> list = new ArrayList<>();

    private MyService() {
    }

    public static MyService getInstance() {
        if (myService == null) {
            synchronized (MyService.class) {
                if (myService == null) {
                    myService = new MyService();
                }
            }
        }
        return myService;
    }
}
