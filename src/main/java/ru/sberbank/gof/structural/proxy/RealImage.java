package ru.sberbank.gof.structural.proxy;

public class RealImage implements Image {
    public RealImage(String sourceFileName) {
        loadImageFromDisk(sourceFileName);
    }

    private void loadImageFromDisk(String sourceFileName) {
        System.out.println("Time and memory consuming loading from disk source...");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image...");
    }
}
