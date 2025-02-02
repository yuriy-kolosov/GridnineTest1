package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Gridnine Test1");
        System.out.println();
//                                              Вывод исходного тестового набора перелетов
        System.out.println("Исходный тестовый набор перелетов:");
        System.out.println(FlightBuilder.createFlights());
        System.out.println();
//                                              Правила фильтрации полетов (правил может быть много...)
//                                              Здесь: примеры правил фильтрации полетов для демонстрации
        Rule rule01 = new Rule01();             // Перелеты с вылетом до текущего момента времени
        Rule rule02 = new Rule02();             // Перелеты с сегментами с датой прилета раньше даты вылета
        Rule rule03 = new Rule03();             // Перелеты, где общее время, проведенное на земле, превышает два часа
        Rule rule04 = new Rule04();             // Перелеты, имеющих пересадки, каждая из которых не превышает одного часа
        Rule rule05 = new Rule05();             // Перелеты с запланированным временем вылета через три дня и более
//
//                                              Исключение из тестового набора перелетов
//                                              с применением метода FlightFilter.excludeFlights()
//                                              согласно следующим правилам фильтрации полетов:
//                                              - вылет до текущего момента времени:
        System.out.println("Сокращенный тестовый набор перелетов: исключены перелеты - с вылетом до текущего времени");
        List<Flight> reducedByRule01Flights = FlightFilter.excludeFlights(FlightBuilder.createFlights(), rule01);
        System.out.println(reducedByRule01Flights);
        System.out.println();
//                                              - сегменты с датой прилета раньше даты вылета (дополнительно):
        System.out.println("Сокращенный тестовый набор перелетов: дополнительно исключены перелеты - с вылетом с датой прилета раньше даты вылета");
        List<Flight> reducedByRule01AndRule02Flights = FlightFilter.excludeFlights(reducedByRule01Flights, rule02);
        System.out.println(reducedByRule01AndRule02Flights);
        System.out.println();
//                                              - перелеты, где общее время, проведенное на земле, превышает два часа
//                                                (дополнительно):
        System.out.println("Сокращенный тестовый набор перелетов: дополнительно исключены перелеты, - где общее время, проведенное на земле, превышает два часа");
        List<Flight> reducedByRule01AndRule02AndRule03Flights = FlightFilter.excludeFlights(reducedByRule01AndRule02Flights, rule03);
        System.out.println(reducedByRule01AndRule02AndRule03Flights);
        System.out.println();
//                                              Результаты обработки тестового набора перелетов
//                                              с применением метода FlightFilter.selectFlights()
//                                              c использованием примеров различных правил фильтрации полетов
//                                              1. на исходном тестовом наборе перелетов:
        System.out.println("1. Фильтрация перелетов на исходном тестовом наборе перелетов (примеры: 5 правил)");
        System.out.println();
        System.out.println("Фильтрация перелетов с вылетом до текущего времени");
        System.out.println(FlightFilter.selectFlights(FlightBuilder.createFlights(), rule01));
        System.out.println();
        System.out.println("Фильтрация перелетов с датой прилета раньше даты вылета");
        System.out.println(FlightFilter.selectFlights(FlightBuilder.createFlights(), rule02));
        System.out.println();
        System.out.println("Фильтрация перелетов, где общее время, проведенное на земле, превышает два часа");
        System.out.println(FlightFilter.selectFlights(FlightBuilder.createFlights(), rule03));
        System.out.println();
        System.out.println("Фильтрация перелетов, имеющих пересадки, каждая из которых не превышает одного часа");
        System.out.println(FlightFilter.selectFlights(FlightBuilder.createFlights(), rule04));
        System.out.println();
        System.out.println("Фильтрация перелетов с запланированным временем вылета через три дня и более");
        System.out.println(FlightFilter.selectFlights(FlightBuilder.createFlights(), rule05));
        System.out.println();
//                                              2. на сокращенном тестовом наборе перелетов:
        System.out.println("2. Фильтрация перелетов на сокращенном тестовом наборе перелетов (примеры: 5 правил)");
        System.out.println();
        System.out.println("Сокращенный тестовый набор перелетов:");
        System.out.println(reducedByRule01AndRule02AndRule03Flights);
        System.out.println();
        System.out.println("Фильтрация перелетов с вылетом до текущего времени");
        System.out.println(FlightFilter.selectFlights(reducedByRule01AndRule02AndRule03Flights, rule01));
        System.out.println();
        System.out.println("Фильтрация перелетов с датой прилета раньше даты вылета");
        System.out.println(FlightFilter.selectFlights(reducedByRule01AndRule02AndRule03Flights, rule02));
        System.out.println();
        System.out.println("Фильтрация перелетов, где общее время, проведенное на земле, превышает два часа");
        System.out.println(FlightFilter.selectFlights(reducedByRule01AndRule02AndRule03Flights, rule03));
        System.out.println();
        System.out.println("Фильтрация перелетов, имеющих пересадки, каждая из которых не превышает одного часа");
        System.out.println(FlightFilter.selectFlights(reducedByRule01AndRule02AndRule03Flights, rule04));
        System.out.println();
        System.out.println("Фильтрация перелетов с запланированным временем вылета через три дня и более");
        System.out.println(FlightFilter.selectFlights(reducedByRule01AndRule02AndRule03Flights, rule05));
        System.out.println();
    }

}
