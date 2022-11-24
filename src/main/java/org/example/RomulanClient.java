package org.example;

public class RomulanClient extends AlienClient {
    public RomulanClient() {
        super();
    }
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
