package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
       Slaves slaves=new Slaves();
       Slave slave=new Slave("Дональд","Трамп","911",1973,3,2);
       Slave slave2=new Slave("Барак","Обама","112",1991,8,24);
       Slave slave3=new Slave("Джо","Байден","303",1803,6,19);
       slaves.add(slave);
       slaves.add(slave2);
       slaves.add(slave3);
       slaves.print();
        System.out.println("-----------------------");
       slaves.delete("303");
       slaves.print();
    }
    }

