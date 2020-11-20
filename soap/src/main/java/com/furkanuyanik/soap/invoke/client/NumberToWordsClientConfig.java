package com.furkanuyanik.soap.invoke.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class NumberToWordsClientConfig {
 
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.furkanuyanik.soap.invoke.client.gen");
        return marshaller;
    }

    @Bean
    public NumberToWordsClient countryClient(Jaxb2Marshaller marshaller) {
        NumberToWordsClient client = new NumberToWordsClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}