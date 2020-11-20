package com.furkanuyanik.soap;

import com.furkanuyanik.soap.invoke.client.NumberToWordsClient;
import com.furkanuyanik.soap.invoke.client.gen.NumberToWordsResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

import static org.junit.Assert.assertNotEquals;

@SpringBootTest
public class SoapClientTests {

  @Autowired
  NumberToWordsClient client;

  @Test
  public void getNumberToWord() {
    NumberToWordsResponse response = client.getWord(BigInteger.TEN);
    assertNotEquals(null, response.getNumberToWordsResult());
    String result = response.getNumberToWordsResult();
  }
}
