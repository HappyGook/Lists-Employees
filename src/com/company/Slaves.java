package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Slaves {

    ArrayList<Slave> slaves=new ArrayList<>();
    public void add(Slave slave){
      slaves.add(slave);
      sortDate();
    }
    public void print(){
        for (int i = 0; i <slaves.size(); i++) {
            System.out.println(slaves.get(i).toString());
        }
    }
    public void delete(String delphone){
        for (int i = 0; i < slaves.size(); i++) {
            if (slaves.get(i).phone.equals(delphone)) slaves.remove(i);
        }
    }
    public void sortDate(){ slaves.sort(new compDate()); }
    class compDate implements Comparator<Slave>{
        @Override
        public int compare(Slave o1, Slave o2) { return o1.compareTo(o2); }
    }
    class compName implements Comparator<Slave>{
        @Override
        public int compare(Slave o1, Slave o2) { return o1.Surname().compareTo(o2.Surname()); }
    }
}
