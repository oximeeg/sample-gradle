package com.oximeeg.sample.app;

import com.oximeeg.sample.lib.Library;

public class App {
    public String getGreeting() {
        return new Library().echo();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
