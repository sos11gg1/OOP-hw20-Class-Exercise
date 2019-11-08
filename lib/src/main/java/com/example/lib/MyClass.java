package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone(1,"華韋","af626","2012","$1500");
        Phone phone1 = new Phone(2,"華逤","6g416sd","2013","$2500");
        Phone phone2 = new Phone(3,"三星","sgd1","2022","$26632");
        Phone phone3 = new Phone(4,"四德","af616","2003","$2523");
        Phone phone4 = new Phone(5,"五福","fasd46a4","2018","$6896");
        phone.alldetailedprint();
        phone1.alldetailedprint();
        phone2.alldetailedprint();
        phone3.alldetailedprint();
        phone4.alldetailedprint();
    }
}
