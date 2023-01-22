package ru.netology.javaga.javagamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @ParameterizedTest
    //@CsvSource({
    // "10000,true,3",
     //"1000000,true,300",
     //"10000,false,1",
     //"1000000,false,100"
    //})
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered,long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
       // long amount = 10_000;
        //boolean registered = true;
        //long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    //@org.junit.jupiter.api.Test
    //void shouldCalculateForRegisteredAndOverLimit() {
        //BonusService service = new BonusService();

        // подготавливаем данные:
        //long amount = 1_000_000;
        //boolean registered = true;
        //long expected = 300;

        // вызываем целевой метод:
       // long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
       // assertEquals(expected, actual);
    //}

    //@org.junit.jupiter.api.Test
    //void shouldCalculateUnregisteredAndUnderLimit() {
        //BonusService service = new BonusService();

        // подготавливаем данные:
        //long amount = 10_000;
        //boolean registered = false;
        //long expected = 1;

        // вызываем целевой метод:
        //long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
    //}

    //@org.junit.jupiter.api.Test
    //void shouldCalculateUnregisteredAndOverLimit() {
        //BonusService service = new BonusService();

        // подготавливаем данные:
        //long amount = 1_000_000;
        //boolean registered = false;
        //long expected = 100;

        // вызываем целевой метод:
        //long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
    //}
}


