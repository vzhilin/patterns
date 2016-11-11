package ru.sberbank.gof.structural.adapter;

public class SuperGreenEngineAdapter extends AbstractEngine {
    private final SuperGreenEngine engine;

    public SuperGreenEngineAdapter(SuperGreenEngine engine) {
        super(engine.getEngineSize(), false);
        this.engine = engine;
    }

    @Override
    public int getSize() {
        return engine.getEngineSize();
    }
}
