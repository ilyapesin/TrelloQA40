package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateUtils {
    public static String getDateString(){
        Date date = new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        return dateFormat.format(date);
    }

}
