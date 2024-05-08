package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class ClientTest {
    private Address address = new Address("street A");
    private Address secondAddress = new Address("Street B");

    private Client client;
    @BeforeEach
    void setUp(){
        //aqui esta el estado SUT
        client = new Client();
        //client.setSomePropertiesIfNeeded
    }
    @Test
    void afterCreationShouldHaveNoAddress(){

    }
    @Test
    void shouldAllowToAddAddress(){
        client.addAddress(address);
    }
    @Test
    void shouldAllowToAddManyAddresses(){
        client.addAddress(address);
        client.addAddress(secondAddress);
    }
}
