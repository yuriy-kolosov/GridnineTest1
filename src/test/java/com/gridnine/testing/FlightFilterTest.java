package com.gridnine.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static com.gridnine.testing.FlightFilterTestConstants.*;

public class FlightFilterTest {
    //                                     Тестовый набор правил фильтрации полетов
    Rule rule01 = new Rule01();
    Rule rule02 = new Rule02();
    Rule rule03 = new Rule03();
    Rule rule04 = new Rule04();
    Rule rule05 = new Rule05();

    private FlightFilterTest() {
    }

    @Test
    public void shouldSelectFlightsWithRule01() {
        //                  Тест фильтрации перелетов, совершивших вылет до текущего момента времени
//                                     Подготовка
        List<Flight> expectedFlights1A = FlightFilter.selectFlights(FLIGHTS1A, rule01);
        List<Flight> expectedFlights1B = FlightFilter.selectFlights(FLIGHTS1B, rule01);
        List<Flight> expectedFlights1C = FlightFilter.selectFlights(FLIGHTS1C, rule01);
        List<Flight> expectedFlights1D = FlightFilter.selectFlights(FLIGHTS1D, rule01);
//
        List<Flight> expectedFlights2A = FlightFilter.selectFlights(FLIGHTS2A, rule01);
        List<Flight> expectedFlights2B = FlightFilter.selectFlights(FLIGHTS2B, rule01);
        List<Flight> expectedFlights2C = FlightFilter.selectFlights(FLIGHTS2C, rule01);
        List<Flight> expectedFlights2D = FlightFilter.selectFlights(FLIGHTS2D, rule01);
        List<Flight> expectedFlights2E = FlightFilter.selectFlights(FLIGHTS2E, rule01);
//
        List<Flight> expectedFlights3A = FlightFilter.selectFlights(FLIGHTS3A, rule01);
        List<Flight> expectedFlights3B = FlightFilter.selectFlights(FLIGHTS3B, rule01);
        List<Flight> expectedFlights3C = FlightFilter.selectFlights(FLIGHTS3C, rule01);
//
        List<Flight> expectedFlights4 = FlightFilter.selectFlights(FLIGHTS4, rule01);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights1A, FLIGHTS1A);
        Assertions.assertEquals(expectedFlights1B, FLIGHTS1B);
        Assertions.assertEquals(expectedFlights1C, FLIGHTS1C);
        Assertions.assertEquals(expectedFlights1D, FLIGHTS1D);
//
        Assertions.assertEquals(expectedFlights2A, absentFlights);
        Assertions.assertEquals(expectedFlights2B, absentFlights);
        Assertions.assertEquals(expectedFlights2C, absentFlights);
        Assertions.assertEquals(expectedFlights2D, absentFlights);
        Assertions.assertEquals(expectedFlights2E, absentFlights);
//
        Assertions.assertEquals(expectedFlights3A, absentFlights);
        Assertions.assertEquals(expectedFlights3B, absentFlights);
        Assertions.assertEquals(expectedFlights3C, absentFlights);
//
        Assertions.assertEquals(expectedFlights4, absentFlights);
    }

    @Test
    public void shouldSelectFlightsWithRule02() {
        //                   Тест фильтрации перелетов, имеющих сегменты с датой прилета раньше даты вылета
//                                     Подготовка
        List<Flight> expectedFlights1A = FlightFilter.selectFlights(FLIGHTS1A, rule02);
        List<Flight> expectedFlights1B = FlightFilter.selectFlights(FLIGHTS1B, rule02);
        List<Flight> expectedFlights1C = FlightFilter.selectFlights(FLIGHTS1C, rule02);
        List<Flight> expectedFlights1D = FlightFilter.selectFlights(FLIGHTS1D, rule02);
//
        List<Flight> expectedFlights2A = FlightFilter.selectFlights(FLIGHTS2A, rule02);
        List<Flight> expectedFlights2B = FlightFilter.selectFlights(FLIGHTS2B, rule02);
        List<Flight> expectedFlights2C = FlightFilter.selectFlights(FLIGHTS2C, rule02);
        List<Flight> expectedFlights2D = FlightFilter.selectFlights(FLIGHTS2D, rule02);
        List<Flight> expectedFlights2E = FlightFilter.selectFlights(FLIGHTS2E, rule02);
//
        List<Flight> expectedFlights3A = FlightFilter.selectFlights(FLIGHTS3A, rule02);
        List<Flight> expectedFlights3B = FlightFilter.selectFlights(FLIGHTS3B, rule02);
        List<Flight> expectedFlights3C = FlightFilter.selectFlights(FLIGHTS3C, rule02);
//
        List<Flight> expectedFlights4 = FlightFilter.selectFlights(FLIGHTS4, rule02);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights1A, absentFlights);
        Assertions.assertEquals(expectedFlights1B, absentFlights);
        Assertions.assertEquals(expectedFlights1C, absentFlights);
        Assertions.assertEquals(expectedFlights1D, absentFlights);
//
        Assertions.assertEquals(expectedFlights2A, FLIGHTS2A);
        Assertions.assertEquals(expectedFlights2B, FLIGHTS2B);
        Assertions.assertEquals(expectedFlights2C, FLIGHTS2C);
        Assertions.assertEquals(expectedFlights2D, FLIGHTS2D);
        Assertions.assertEquals(expectedFlights2E, FLIGHTS2E);
//
        Assertions.assertEquals(expectedFlights3A, absentFlights);
        Assertions.assertEquals(expectedFlights3B, absentFlights);
        Assertions.assertEquals(expectedFlights3C, absentFlights);
//
        Assertions.assertEquals(expectedFlights4, absentFlights);
    }

    @Test
    public void shouldSelectFlightsWithRule03() {
        //                 Тест фильтрации перелетов, где общее время, проведенное на земле, превышает два часа
//                                     Подготовка
        List<Flight> expectedFlights1A = FlightFilter.selectFlights(FLIGHTS1A, rule03);
        List<Flight> expectedFlights1B = FlightFilter.selectFlights(FLIGHTS1B, rule03);
        List<Flight> expectedFlights1C = FlightFilter.selectFlights(FLIGHTS1C, rule03);
        List<Flight> expectedFlights1D = FlightFilter.selectFlights(FLIGHTS1D, rule03);
//
        List<Flight> expectedFlights2A = FlightFilter.selectFlights(FLIGHTS2A, rule03);
        List<Flight> expectedFlights2B = FlightFilter.selectFlights(FLIGHTS2B, rule03);
        List<Flight> expectedFlights2C = FlightFilter.selectFlights(FLIGHTS2C, rule03);
        List<Flight> expectedFlights2D = FlightFilter.selectFlights(FLIGHTS2D, rule03);
        List<Flight> expectedFlights2E = FlightFilter.selectFlights(FLIGHTS2E, rule03);
//
        List<Flight> expectedFlights3A = FlightFilter.selectFlights(FLIGHTS3A, rule03);
        List<Flight> expectedFlights3B = FlightFilter.selectFlights(FLIGHTS3B, rule03);
        List<Flight> expectedFlights3C = FlightFilter.selectFlights(FLIGHTS3C, rule03);
//
        List<Flight> expectedFlights4 = FlightFilter.selectFlights(FLIGHTS4, rule03);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights1A, absentFlights);
        Assertions.assertEquals(expectedFlights1B, absentFlights);
        Assertions.assertEquals(expectedFlights1C, FLIGHTS1C);
        Assertions.assertEquals(expectedFlights1D, FLIGHTS1D);
//
        Assertions.assertEquals(expectedFlights2A, absentFlights);
        Assertions.assertEquals(expectedFlights2B, absentFlights);
        Assertions.assertEquals(expectedFlights2C, absentFlights);
        Assertions.assertEquals(expectedFlights2D, FLIGHTS2D);
        Assertions.assertEquals(expectedFlights2E, FLIGHTS2E);
//
        Assertions.assertEquals(expectedFlights3A, FLIGHTS3A);
        Assertions.assertEquals(expectedFlights3B, FLIGHTS3B);
        Assertions.assertEquals(expectedFlights3C, FLIGHTS3C);
//
        Assertions.assertEquals(expectedFlights4, FLIGHTS4);
    }

    @Test
    public void shouldSelectFlightsWithRule04() {
        //                  Тест фильтрации перелетов, имеющих пересадки, каждая из которых не превышает одного часа
//                                     Подготовка
        List<Flight> expectedFlights1A = FlightFilter.selectFlights(FLIGHTS1A, rule04);
        List<Flight> expectedFlights1B = FlightFilter.selectFlights(FLIGHTS1B, rule04);
        List<Flight> expectedFlights1C = FlightFilter.selectFlights(FLIGHTS1C, rule04);
        List<Flight> expectedFlights1D = FlightFilter.selectFlights(FLIGHTS1D, rule04);
//
        List<Flight> expectedFlights2A = FlightFilter.selectFlights(FLIGHTS2A, rule04);
        List<Flight> expectedFlights2B = FlightFilter.selectFlights(FLIGHTS2B, rule04);
        List<Flight> expectedFlights2C = FlightFilter.selectFlights(FLIGHTS2C, rule04);
        List<Flight> expectedFlights2D = FlightFilter.selectFlights(FLIGHTS2D, rule04);
        List<Flight> expectedFlights2E = FlightFilter.selectFlights(FLIGHTS2E, rule04);
//
        List<Flight> expectedFlights3A = FlightFilter.selectFlights(FLIGHTS3A, rule04);
        List<Flight> expectedFlights3B = FlightFilter.selectFlights(FLIGHTS3B, rule04);
        List<Flight> expectedFlights3C = FlightFilter.selectFlights(FLIGHTS3C, rule04);
//
        List<Flight> expectedFlights4 = FlightFilter.selectFlights(FLIGHTS4, rule04);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights1A, absentFlights);
        Assertions.assertEquals(expectedFlights1B, FLIGHTS1B);
        Assertions.assertEquals(expectedFlights1C, FLIGHTS1C);
        Assertions.assertEquals(expectedFlights1D, FLIGHTS1D);
//
        Assertions.assertEquals(expectedFlights2A, absentFlights);
        Assertions.assertEquals(expectedFlights2B, FLIGHTS2B);
        Assertions.assertEquals(expectedFlights2C, FLIGHTS2C);
        Assertions.assertEquals(expectedFlights2D, absentFlights);
        Assertions.assertEquals(expectedFlights2E, absentFlights);
//
        Assertions.assertEquals(expectedFlights3A, absentFlights);
        Assertions.assertEquals(expectedFlights3B, absentFlights);
        Assertions.assertEquals(expectedFlights3C, absentFlights);
//
        Assertions.assertEquals(expectedFlights4, FLIGHTS4);
    }

    @Test
    public void shouldSelectFlightsWithRule05() {
        //                  Тест фильтрации перелетов с запланированным временем вылета через три дня и более
//                                     Подготовка
        List<Flight> expectedFlights1A = FlightFilter.selectFlights(FLIGHTS1A, rule05);
        List<Flight> expectedFlights1B = FlightFilter.selectFlights(FLIGHTS1B, rule05);
        List<Flight> expectedFlights1C = FlightFilter.selectFlights(FLIGHTS1C, rule05);
        List<Flight> expectedFlights1D = FlightFilter.selectFlights(FLIGHTS1D, rule05);
//
        List<Flight> expectedFlights2A = FlightFilter.selectFlights(FLIGHTS2A, rule05);
        List<Flight> expectedFlights2B = FlightFilter.selectFlights(FLIGHTS2B, rule05);
        List<Flight> expectedFlights2C = FlightFilter.selectFlights(FLIGHTS2C, rule05);
        List<Flight> expectedFlights2D = FlightFilter.selectFlights(FLIGHTS2D, rule05);
        List<Flight> expectedFlights2E = FlightFilter.selectFlights(FLIGHTS2E, rule05);
//
        List<Flight> expectedFlights3A = FlightFilter.selectFlights(FLIGHTS3A, rule05);
        List<Flight> expectedFlights3B = FlightFilter.selectFlights(FLIGHTS3B, rule05);
        List<Flight> expectedFlights3C = FlightFilter.selectFlights(FLIGHTS3C, rule05);
//
        List<Flight> expectedFlights4 = FlightFilter.selectFlights(FLIGHTS4, rule05);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights1A, absentFlights);
        Assertions.assertEquals(expectedFlights1B, absentFlights);
        Assertions.assertEquals(expectedFlights1C, absentFlights);
        Assertions.assertEquals(expectedFlights1D, absentFlights);
//
        Assertions.assertEquals(expectedFlights2A, FLIGHTS2A);
        Assertions.assertEquals(expectedFlights2B, FLIGHTS2B);
        Assertions.assertEquals(expectedFlights2C, FLIGHTS2C);
        Assertions.assertEquals(expectedFlights2D, FLIGHTS2D);
        Assertions.assertEquals(expectedFlights2E, FLIGHTS2E);
//
        Assertions.assertEquals(expectedFlights3A, FLIGHTS3A);
        Assertions.assertEquals(expectedFlights3B, FLIGHTS3B);
        Assertions.assertEquals(expectedFlights3C, FLIGHTS3C);
//
        Assertions.assertEquals(expectedFlights4, FLIGHTS4);
    }

    @Test
    public void shouldExcludeFlightsWithRule01() {
        //                  Тест исключения перелетов, совершивших вылет до текущего момента времени
//                                     Подготовка
        List<Flight> expectedFlights1A = FlightFilter.excludeFlights(FLIGHTS1A, rule01);
        List<Flight> expectedFlights1B = FlightFilter.excludeFlights(FLIGHTS1B, rule01);
        List<Flight> expectedFlights1C = FlightFilter.excludeFlights(FLIGHTS1C, rule01);
        List<Flight> expectedFlights1D = FlightFilter.excludeFlights(FLIGHTS1D, rule01);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights1A, absentFlights);
        Assertions.assertEquals(expectedFlights1B, absentFlights);
        Assertions.assertEquals(expectedFlights1C, absentFlights);
        Assertions.assertEquals(expectedFlights1D, absentFlights);
    }

    @Test
    public void shouldExcludeFlightsWithRule02() {
        //                   Тест исключения перелетов, имеющих сегменты с датой прилета раньше даты вылета
//                                     Подготовка
        List<Flight> expectedFlights2A = FlightFilter.excludeFlights(FLIGHTS2A, rule02);
        List<Flight> expectedFlights2B = FlightFilter.excludeFlights(FLIGHTS2B, rule02);
        List<Flight> expectedFlights2C = FlightFilter.excludeFlights(FLIGHTS2C, rule02);
        List<Flight> expectedFlights2D = FlightFilter.excludeFlights(FLIGHTS2D, rule02);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights2A, absentFlights);
        Assertions.assertEquals(expectedFlights2B, absentFlights);
        Assertions.assertEquals(expectedFlights2C, absentFlights);
        Assertions.assertEquals(expectedFlights2D, absentFlights);
    }

    @Test
    public void shouldExcludeFlightsWithRule03() {
        //                 Тест исключения перелетов, где общее время, проведенное на земле, превышает два часа
//                                     Подготовка
        List<Flight> expectedFlights3A = FlightFilter.excludeFlights(FLIGHTS3A, rule03);
        List<Flight> expectedFlights3B = FlightFilter.excludeFlights(FLIGHTS3B, rule03);
        List<Flight> expectedFlights3C = FlightFilter.excludeFlights(FLIGHTS3C, rule03);
//
        List<Flight> absentFlights = Collections.emptyList();
//                                      Выполнение
        Assertions.assertEquals(expectedFlights3A, absentFlights);
        Assertions.assertEquals(expectedFlights3B, absentFlights);
        Assertions.assertEquals(expectedFlights3C, absentFlights);
    }

}
