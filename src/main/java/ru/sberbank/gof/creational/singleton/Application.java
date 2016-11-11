package ru.sberbank.gof.creational.singleton;

public class Application {
    public static void main(String[] args) {
        /*
         * Making a class a singleton can
         * make it difficult to test its clients, as it’s impossible to substitute a mock implementation
         * for a singleton unless it implements an interface that serves as its type.
         *
         * To maintain the singleton guarantee, you
         * have to declare all instance fields transient and provide a readResolve method.
         * Otherwise, each time a serialized instance is deserialized, a new
         * instance will be created.
         *
         * Enforce noninstantiability with a private constructor.
         * Attempting to enforce noninstantiability by making a class abstract does not work.
         */
    }
}
