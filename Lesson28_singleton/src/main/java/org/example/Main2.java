package org.example;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        MyService service = MyService.getInstance();
        List<String> list = service.getList();
    }
}
