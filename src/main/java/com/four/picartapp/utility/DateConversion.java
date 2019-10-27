package com.four.picartapp.utility;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
    public Date stringToDate(String dateInString) throws Exception {
        return new SimpleDateFormat("dd/MM/yyyy").parse(dateInString);
    }

    ;
}
