/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author chdelmas
 */
public class DateUtils {
     public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

     public static String now() {
          Calendar cal = Calendar.getInstance();
         SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
     return sdf.format(cal.getTime());
   }

 
    public static String now(String dateFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    return sdf.format(cal.getTime());

}
    public static String getSysDate()    {    
               String date = DateFormat.getInstance().format(new Date());
        return date;
    }
    
    public static Date asDate(LocalDate localDate) {
      return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date asDate(LocalDateTime localDateTime) {
     return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
   }

    public static LocalDate asLocalDate(Date date) {
     return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
   }
 
    public static LocalDateTime asLocalDateTime(Date date) {
      return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
   }
    
    public static Date convertFrom(LocalDate date) {
    return java.sql.Timestamp.valueOf(date.atStartOfDay());
}
    
     public static Date fromLocalDate(LocalDate date) {
    Instant instant = date.atStartOfDay().atZone(ZoneId.systemDefault())
        .toInstant();
    return Date.from(instant);
  }
}
