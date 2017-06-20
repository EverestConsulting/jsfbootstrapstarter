package com.everestconsulting.jsfbootstrapstarter;

import java.util.Calendar;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author emkopic
 */
@ManagedBean(name="date")

public class Date {
    
    int year = Calendar.getInstance().get(Calendar.YEAR);

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
