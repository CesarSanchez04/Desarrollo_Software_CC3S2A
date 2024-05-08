package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CalculadorTest {

//    private Calculador calculador;

//    @BeforeEach
//    void setUp(){
//        calculador = new Calculador();
//    }

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado;
        resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    public void testSum_NegativeNumbers() {
        //Arrange
        Calculador calculador = new Calculador();
        int numA = -15;
        int numB = -6;

        //Act
        int resultado;
        resultado = calculador.sumar(numA, numB);

        //Assert
        assertEquals(-21, resultado, "El resultado deberia ser -21");
    }

    @Test
    public void testRest_PositiveNumbers() {
        //Arrange
        Calculador calculador = new Calculador();
        int numA = 7;
        int numB = 2;

        //Act
        int result = calculador.restar(numA,numB);

        //Assert
        assertEquals(5,result, "7-2 deberia ser 5");
    }

    @Test
    public void testRest_NegativeNumbers() {
        //Arrange
        Calculador calculador = new Calculador();
        int numA = -15;
        int numB = -5;

        //Act
        int resultado;
        resultado = calculador.restar(numA, numB);

        //Assert
        assertEquals(-10, resultado, "El resultado deberia ser -10");
    }

    @Test
    public void testMult_PositiveNumbers(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = 5;
        int numeroB = 4;

        //Act
        int resultado;
        resultado = calculador.multiplicacion(numeroA, numeroB);

        //Assert
        assertEquals(20, resultado, "No es igual");
    }

    @Test
    public void testMult_NegativeNumbers(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -5;
        int numeroB = -4;

        //Act
        int resultado;
        resultado = calculador.multiplicacion(numeroA, numeroB);

        //Assert
        assertEquals(20, resultado, "El resultado deberia ser 20");
    }

    @Test
    public void testDivision() {
        //Arrange
        Calculador calculador = new Calculador();
        int numA = 15;
        int numB = 5;

        //Act
        double resultado;
        resultado = calculador.division(numA , numB);

        //Assert
        assertEquals(3, resultado, "La division deberia ser 3");
    }

    @Test
    public void testDivision_Zero() {
        //Arrange
        Calculador calculador = new Calculador();
        int numA = 15;
        int numB = 0;

        //Act
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculador.division(10, 0);
        });

        //Assert
        assertEquals("Division por cero", exception.getMessage());
    }

    @Test
    public void testDivision_NegativeNumbers(){
        //Arrange
        Calculador calculador = new Calculador();
        int numA = -15;
        int numB = -5;

        //Act
        double resultado;
        resultado = calculador.division(numA, numB);

        //Assert
        assertEquals(3, resultado, "El resultado deberia ser 3");
    }
}
