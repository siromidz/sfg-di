package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FA")
@Service("i18nService")
public class I18nPersianGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "سلام - Fa";
    }
}
