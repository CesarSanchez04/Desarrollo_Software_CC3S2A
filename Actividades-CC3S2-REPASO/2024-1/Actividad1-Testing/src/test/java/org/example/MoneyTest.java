package org.example;
import org.junit.jupiter.api.Test;
// esta linea permite la anotacion de la linea 6 para que se vea como un metodo de prueba
import static org.assertj.core.api.Assertions.assertThat;
//hace que la verificacion sea mas precisa

class MoneyTest {
    //puede ser clase publica
    @Test
    void constructorShouldSetAmountAndCurrency() {
        //metodo de prueba
        // Completa
        Money money = new Money(10, "USD");
        // se crea al SUT

        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo("USD");
        //se crean asserciones como afirmaciones
    }

}