/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.LesDatesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1-Creation des dates/times: now(), of()
       // La méthode now
        /*
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Sans Zone");
        System.out.println(ldt);
        System.out.println("Avec Zone");
        ZoneId zi = ZoneId.of("Europe/Paris");
        ZonedDateTime d = ZonedDateTime.of(ldt, zi);
        System.out.println(d);*/
        
        // La méthode of
        /*
        LocalDate ld = LocalDate.of(2021, Month.MAY, 15);
        System.out.println(ld);
        LocalDate ld1 = LocalDate.of(2021, 5, 15);
        System.out.println(ld1);
        LocalTime lt = LocalTime.of(11, 19);
        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        System.out.println(ldt);
        LocalDateTime ldt2 = LocalDateTime.of(2021, Month.MARCH, 2, 10, 15);
        System.out.println(ldt2);*/
        
        //2-Manipulation des dates/times
        /*
        LocalDate ld = LocalDate.of(2021, Month.MAY, 15);
        System.out.println(ld);
        //System.out.println(ld.plusYears(2));
        //ld = ld.plusYears(2);
        //System.out.println(ld);
        //System.out.println(ld.plusWeeks(2));
        //System.out.println(ld.minusDays(2));
        
        Period p = Period.of(1, 2, 4);
        Period p2 = Period.ofDays(3);
        ld = ld.plus(p2);
        System.out.println(ld);
        */
        //3-formatting des dates/times
        
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        System.out.println(date); // ISO
        //DateTimeFormatter f = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        //System.out.println(date.format(fs));
        //System.out.println(date.format(fm));
        //System.out.println(date.format(ff));
        //System.out.println(f.format(date));
        System.out.println(dateTime);
        System.out.println(dateTime.format(fs));

    }
    
}
