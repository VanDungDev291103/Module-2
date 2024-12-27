package ss2_java_overview_construcor.build_and_use_construcorofclass_time;

public class Main {
    // xây dựng và sử dụng constructor lớp thời gian
    public static void main(String[] args) {
        Time time = new Time();
        time.output();

        Time time2 = new Time(7);
        time2.output();

        Time time3 = new Time(8,30);
        time3.output();

        Time time4 = new Time(15,27,50);
        time4.output();

        Time time5 = new Time(time4);
        time5.output();
    }
}
