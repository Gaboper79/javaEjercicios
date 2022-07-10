package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Star");

        Counter counter = new Counter();
        Thread first = new Thread(counter, "first");
        Thread second = new Thread(counter, "second");
        first.start();
        second.start();
        first.join();
        first.join();
        //Thread.sleep(5000);
        System.out.println(counter.counter.get());
        System.out.println("Stop");

    }

    static class Counter extends Thread {
        public AtomicInteger counter = new AtomicInteger(0);

        public void run() {
            for (int i = 0; i < 100_000_000; i++) {
                counter.addAndGet(1);
            }
        }
    }

}