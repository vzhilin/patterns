package ru.sberbank.gof.creational.prototype;

public class StandardEngine implements Engine {
    public StandardEngine(int size) {
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isTurbo() {
        return false;
    }
}
