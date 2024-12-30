package ss3_overview_static.local_day_ultil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    //định dạng chuỗi ngày tháng dd/MM/yy
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //định dạng chuỗi ngày tháng yyyy/MM/dd
    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate parse_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    public static LocalDate parse_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    public static String format_ddMMyyyy(LocalDate date) {
        return date.format(formatter_ddMMyyyy);
    }

    public static String format_yyyyMMdd(LocalDate date) {
        return date.format(formatter_yyyyMMdd);
    }
}
