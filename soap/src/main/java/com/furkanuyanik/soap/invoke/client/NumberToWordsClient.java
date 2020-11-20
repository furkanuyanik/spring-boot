package com.furkanuyanik.soap.invoke.client;

import com.furkanuyanik.soap.invoke.client.gen.NumberToWords;
import com.furkanuyanik.soap.invoke.client.gen.NumberToWordsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;

public class NumberToWordsClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(NumberToWordsClient.class);

    public NumberToWordsResponse getWord(BigInteger numberToWords) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(numberToWords);

        NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate()
          .marshalSendAndReceive(request);

        return response;
    }
}