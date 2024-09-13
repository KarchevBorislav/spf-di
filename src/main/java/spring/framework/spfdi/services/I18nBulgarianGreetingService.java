package spring.framework.spfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("BG")
@Service("i18nService")
public class I18nBulgarianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Здравей свят - BG";
    }
}
