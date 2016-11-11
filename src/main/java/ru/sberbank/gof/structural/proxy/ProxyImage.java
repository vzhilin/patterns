package ru.sberbank.gof.structural.proxy;

public class ProxyImage implements Image {
    private final String sourceFileName;
    private RealImage image;

    public ProxyImage(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    // Minimize scope!
    private synchronized void initialize() {
        if (image == null) {
            image = new RealImage(sourceFileName);
        }
    }

    @Override
    public void displayImage() {
        initialize();

        image.displayImage();
    }
}
