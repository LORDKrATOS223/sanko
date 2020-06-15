package com.company;

import java.io.IOException;

public class ScannerApp {
    public static void main(String args[]) throws IOException {
        // первый аргумент программы - это ссылка, второй аргумент - глубина поиска
        Crawler crawler = new Crawler(args[0], Integer.parseInt(args[1]));
        crawler.Scan();
        System.out.println("Depth: " + Integer.parseInt(args[1]));
        crawler.getSites();
    }
}
