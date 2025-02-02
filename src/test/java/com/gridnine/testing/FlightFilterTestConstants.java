package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

import static com.gridnine.testing.FlightBuilder.createFlight;

public class FlightFilterTestConstants {

    //                                      1A. Сегменты первого тестового перелета
//                                         (вылет до текущего момента времени - один сегмент)
    public static final LocalDateTime FLIGHT1A_DEPARTURE_DATE1 = LocalDateTime.now().minusDays(1).plusHours(1);
    public static final LocalDateTime FLIGHT1A_ARRIVAL_DATE1 = LocalDateTime.now().minusDays(1).plusHours(3);

    //                                      1B. Сегменты второго тестового перелета
//                                         (вылет до текущего момента времени - первый сегмент из двух)
    public static final LocalDateTime FLIGHT1B_DEPARTURE_DATE1 = LocalDateTime.now().minusDays(1).plusHours(1);
    public static final LocalDateTime FLIGHT1B_ARRIVAL_DATE1 = LocalDateTime.now().minusDays(1).plusHours(3);

    public static final LocalDateTime FLIGHT1B_DEPARTURE_DATE2 = LocalDateTime.now().minusDays(1).plusHours(4);
    public static final LocalDateTime FLIGHT1B_ARRIVAL_DATE2 = LocalDateTime.now().minusDays(1).plusHours(6);

    //                                      1C. Сегменты третьего тестового перелета
//                                         (вылет до текущего момента времени - второй сегмент из двух)
    public static final LocalDateTime FLIGHT1C_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(1).plusHours(1);
    public static final LocalDateTime FLIGHT1C_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(1).plusHours(3);

    public static final LocalDateTime FLIGHT1C_DEPARTURE_DATE2 = LocalDateTime.now().minusDays(1).plusHours(1);
    public static final LocalDateTime FLIGHT1C_ARRIVAL_DATE2 = LocalDateTime.now().minusDays(1).plusHours(3);

    //                                      1D. Сегменты четвертого тестового перелета
//                                         (вылет до текущего момента времени - третий сегмент из трех)
    public static final LocalDateTime FLIGHT1D_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(1).plusHours(1);
    public static final LocalDateTime FLIGHT1D_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(1).plusHours(3);

    public static final LocalDateTime FLIGHT1D_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(1).plusHours(4);
    public static final LocalDateTime FLIGHT1D_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(1).plusHours(5);

    public static final LocalDateTime FLIGHT1D_DEPARTURE_DATE3 = LocalDateTime.now().minusDays(1).plusHours(1);
    public static final LocalDateTime FLIGHT1D_ARRIVAL_DATE3 = LocalDateTime.now().minusDays(1).plusHours(3);

    //                                      2A. Сегменты пятого тестового перелета
//                                         (с датой прилета раньше даты вылета - один сегмент)
    public static final LocalDateTime FLIGHT2A_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(2);
    public static final LocalDateTime FLIGHT2A_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);

    //                                      2B. Сегменты шестого тестового перелета
//                                         (с датой прилета раньше даты вылета - первый сегмент из двух)
    public static final LocalDateTime FLIGHT2B_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(3);
    public static final LocalDateTime FLIGHT2B_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);

    public static final LocalDateTime FLIGHT2B_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(2);
    public static final LocalDateTime FLIGHT2B_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(4);

    //                                      2C. Сегменты седьмого тестового перелета
//                                         (с датой прилета раньше даты вылета - второй сегмент из двух)
    public static final LocalDateTime FLIGHT2C_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);
    public static final LocalDateTime FLIGHT2C_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(5);

    public static final LocalDateTime FLIGHT2C_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(6);
    public static final LocalDateTime FLIGHT2C_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(1);

    //                                      2D. Сегменты восьмого тестового перелета
//                                         (с датой прилета раньше даты вылета - оба сегмента из двух)
    public static final LocalDateTime FLIGHT2D_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(2);
    public static final LocalDateTime FLIGHT2D_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);

    public static final LocalDateTime FLIGHT2D_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(6);
    public static final LocalDateTime FLIGHT2D_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(1);

    //                                      2E. Сегменты девятого тестового перелета
//                                         (с датой прилета раньше даты вылета - третий сегмент из трех)
    public static final LocalDateTime FLIGHT2E_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);
    public static final LocalDateTime FLIGHT2E_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(5);

    public static final LocalDateTime FLIGHT2E_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(6);
    public static final LocalDateTime FLIGHT2E_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(7);

    public static final LocalDateTime FLIGHT2E_DEPARTURE_DATE3 = LocalDateTime.now().plusDays(5).plusHours(9);
    public static final LocalDateTime FLIGHT2E_ARRIVAL_DATE3 = LocalDateTime.now().plusDays(5).plusHours(8);

    //                                      3A. Сегменты десятого тестового перелета
//                                         (общее время, проведенное на земле, превышает два часа - два сегмента)
    public static final LocalDateTime FLIGHT3A_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(6);
    public static final LocalDateTime FLIGHT3A_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(7);

    public static final LocalDateTime FLIGHT3A_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(10);
    public static final LocalDateTime FLIGHT3A_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(11);

    //                                      3B. Сегменты одиннадцатого тестового перелета
//                                         (общее время, проведенное на земле, превышает два часа - три сегмента)
    public static final LocalDateTime FLIGHT3B_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);
    public static final LocalDateTime FLIGHT3B_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(3);

    public static final LocalDateTime FLIGHT3B_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(4);
    public static final LocalDateTime FLIGHT3B_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(5);

    public static final LocalDateTime FLIGHT3B_DEPARTURE_DATE3 = LocalDateTime.now().plusDays(5).plusHours(7);
    public static final LocalDateTime FLIGHT3B_ARRIVAL_DATE3 = LocalDateTime.now().plusDays(5).plusHours(9);

    //                                      3C. Сегменты двенадцатого тестового перелета
//                                         (общее время, проведенное на земле, превышает два часа - четыре сегмента)
    public static final LocalDateTime FLIGHT3C_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);
    public static final LocalDateTime FLIGHT3C_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(3);

    public static final LocalDateTime FLIGHT3C_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(4);
    public static final LocalDateTime FLIGHT3C_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(5);

    public static final LocalDateTime FLIGHT3C_DEPARTURE_DATE3 = LocalDateTime.now().plusDays(5).plusHours(7);
    public static final LocalDateTime FLIGHT3C_ARRIVAL_DATE3 = LocalDateTime.now().plusDays(5).plusHours(9);

    public static final LocalDateTime FLIGHT3C_DEPARTURE_DATE4 = LocalDateTime.now().plusDays(5).plusHours(12);
    public static final LocalDateTime FLIGHT3C_ARRIVAL_DATE4 = LocalDateTime.now().plusDays(5).plusHours(13);

    //                                      4. Сегменты тринадцатого тестового перелета
//                                         (имеющих пересадки, каждая из которых не превышает одного часа)
    public static final LocalDateTime FLIGHT4_DEPARTURE_DATE1 = LocalDateTime.now().plusDays(5).plusHours(1);
    public static final LocalDateTime FLIGHT4_ARRIVAL_DATE1 = LocalDateTime.now().plusDays(5).plusHours(3);

    public static final LocalDateTime FLIGHT4_DEPARTURE_DATE2 = LocalDateTime.now().plusDays(5).plusHours(4);
    public static final LocalDateTime FLIGHT4_ARRIVAL_DATE2 = LocalDateTime.now().plusDays(5).plusHours(6);

    public static final LocalDateTime FLIGHT4_DEPARTURE_DATE3 = LocalDateTime.now().plusDays(5).plusHours(7);
    public static final LocalDateTime FLIGHT4_ARRIVAL_DATE3 = LocalDateTime.now().plusDays(5).plusHours(8);

    public static final LocalDateTime FLIGHT4_DEPARTURE_DATE4 = LocalDateTime.now().plusDays(5).plusHours(9);
    public static final LocalDateTime FLIGHT4_ARRIVAL_DATE4 = LocalDateTime.now().plusDays(5).plusHours(11);

    //                                          1-ый тестовый перелет (1A)
    public static final List<Flight> FLIGHTS1A = List.of(createFlight(FLIGHT1A_DEPARTURE_DATE1, FLIGHT1A_ARRIVAL_DATE1));

    //                                          2-ой тестовый перелет (1B)
    public static final List<Flight> FLIGHTS1B = List.of(createFlight(FLIGHT1B_DEPARTURE_DATE1, FLIGHT1B_ARRIVAL_DATE1
            , FLIGHT1B_DEPARTURE_DATE2, FLIGHT1B_ARRIVAL_DATE2));

    //                                          3-ий тестовый перелет (1C)
    public static final List<Flight> FLIGHTS1C = List.of(createFlight(FLIGHT1C_DEPARTURE_DATE1, FLIGHT1C_ARRIVAL_DATE1
            , FLIGHT1C_DEPARTURE_DATE2, FLIGHT1C_ARRIVAL_DATE2));

    //                                          4-ый тестовый перелет (1D)
    public static final List<Flight> FLIGHTS1D = List.of(createFlight(FLIGHT1D_DEPARTURE_DATE1, FLIGHT1D_ARRIVAL_DATE1
            , FLIGHT1D_DEPARTURE_DATE2, FLIGHT1D_ARRIVAL_DATE2
            , FLIGHT1D_DEPARTURE_DATE3, FLIGHT1D_ARRIVAL_DATE3));

    //                                          5-ый тестовый перелет (2A)
    public static final List<Flight> FLIGHTS2A = List.of(createFlight(FLIGHT2A_DEPARTURE_DATE1, FLIGHT2A_ARRIVAL_DATE1));

    //                                          6-ой тестовый перелет (2B)
    public static final List<Flight> FLIGHTS2B = List.of(createFlight(FLIGHT2B_DEPARTURE_DATE1, FLIGHT2B_ARRIVAL_DATE1
            , FLIGHT2B_DEPARTURE_DATE2, FLIGHT2B_ARRIVAL_DATE2));

    //                                          7-ой тестовый перелет (2C)
    public static final List<Flight> FLIGHTS2C = List.of(createFlight(FLIGHT2C_DEPARTURE_DATE1, FLIGHT2C_ARRIVAL_DATE1
            , FLIGHT2C_DEPARTURE_DATE2, FLIGHT2C_ARRIVAL_DATE2));

    //                                          8-ой тестовый перелет (2D)
    public static final List<Flight> FLIGHTS2D = List.of(createFlight(FLIGHT2D_DEPARTURE_DATE1, FLIGHT2D_ARRIVAL_DATE1
            , FLIGHT2D_DEPARTURE_DATE2, FLIGHT2D_ARRIVAL_DATE2));

    //                                          9-ый тестовый перелет (2E)
    public static final List<Flight> FLIGHTS2E = List.of(createFlight(FLIGHT2E_DEPARTURE_DATE1, FLIGHT2E_ARRIVAL_DATE1
            , FLIGHT2E_DEPARTURE_DATE2, FLIGHT2E_ARRIVAL_DATE2
            , FLIGHT2E_DEPARTURE_DATE3, FLIGHT2E_ARRIVAL_DATE3));

    //                                          10-ый тестовый перелет (3A)
    public static final List<Flight> FLIGHTS3A = List.of(createFlight(FLIGHT3A_DEPARTURE_DATE1, FLIGHT3A_ARRIVAL_DATE1
            , FLIGHT3A_DEPARTURE_DATE2, FLIGHT3A_ARRIVAL_DATE2));

    //                                          11-ый тестовый перелет (3B)
    public static final List<Flight> FLIGHTS3B = List.of(createFlight(FLIGHT3B_DEPARTURE_DATE1, FLIGHT3B_ARRIVAL_DATE1
            , FLIGHT3B_DEPARTURE_DATE2, FLIGHT3B_ARRIVAL_DATE2
            , FLIGHT3B_DEPARTURE_DATE3, FLIGHT3B_ARRIVAL_DATE3));

    //                                          12-ый тестовый перелет (3C)
    public static final List<Flight> FLIGHTS3C = List.of(createFlight(FLIGHT3C_DEPARTURE_DATE1, FLIGHT3C_ARRIVAL_DATE1
            , FLIGHT3C_DEPARTURE_DATE2, FLIGHT3C_ARRIVAL_DATE2
            , FLIGHT3C_DEPARTURE_DATE3, FLIGHT3C_ARRIVAL_DATE3
            , FLIGHT3C_DEPARTURE_DATE4, FLIGHT3C_ARRIVAL_DATE4));

    //                                          13-ый тестовый перелет (4)
    public static final List<Flight> FLIGHTS4 = List.of(createFlight(FLIGHT4_DEPARTURE_DATE1, FLIGHT4_ARRIVAL_DATE1
            , FLIGHT4_DEPARTURE_DATE2, FLIGHT4_ARRIVAL_DATE2
            , FLIGHT4_DEPARTURE_DATE3, FLIGHT4_ARRIVAL_DATE3
            , FLIGHT4_DEPARTURE_DATE4, FLIGHT4_ARRIVAL_DATE4));

}
