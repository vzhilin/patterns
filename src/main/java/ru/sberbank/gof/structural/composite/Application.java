package ru.sberbank.gof.structural.composite;

public class Application {
    public static void main(String[] args) {
        Item nut = new Part("Nut", 5);
        Item bolt = new Part("Bolt", 9);
        Item panel = new Part("Panel", 35);

        // Штуковина
        Item gizmo = new Assembly("Gizmo");
        gizmo.addItem(panel);
        gizmo.addItem(nut);
        gizmo.addItem(bolt);

        Item widget = new Assembly("Widget");
        widget.addItem(gizmo);
        widget.addItem(nut);

        System.out.println(widget);
    }
}
