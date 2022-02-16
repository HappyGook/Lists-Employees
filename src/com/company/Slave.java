package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Slave implements Comparable<Slave>{
    String name;
    String surname;
    String phone;
    Calendar birth;

    public Slave(String name,String surname,String phone,int year, int month,int day) {
        this.name=name;
        this.surname=surname;
        this.phone=phone;
        this.birth=new GregorianCalendar(year,month,day);
    }

    @Override
    public int compareTo(Slave o) {
        if(this.birth.getTimeInMillis()<(int)o.birth.getTimeInMillis())return -1;
        else if(this.birth==o.birth) return 0;
        else if(this.birth.getTimeInMillis()>(int)o.birth.getTimeInMillis()) return 1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Slave obj1=(Slave) obj;
        return name.equals(((Slave) obj).name);
    }

    @Override
    public String toString() {
        return name+" "+surname+", Телефон: "+phone+", Дата рождения: "+birth.get(Calendar.DAY_OF_MONTH)+" "+
                birth.get(Calendar.MONTH)+" "+birth.get(Calendar.YEAR);
    }
    public String Surname(){ return this.surname;}
}
