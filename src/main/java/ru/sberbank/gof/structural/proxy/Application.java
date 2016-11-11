package ru.sberbank.gof.structural.proxy;

public class Application {
    public static void main(String[] args) {
        Image image = new ProxyImage("c:\\1.bmp");
        image.displayImage();
        image.displayImage();
    }
}
