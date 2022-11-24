package org.example;

public class FerengiClient extends AlienClient {
    public FerengiClient() {
        super();
    }
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
