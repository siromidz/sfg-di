package com.example.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        return switch (lang) {
            default -> new PrimaryGreetingService(greetingRepository);
            case "es" -> new PrimarySpanishGreetingService(greetingRepository);
            case "de" -> new PrimaryGermanGreetingService(greetingRepository);
        };
    }
}
