package modifier.exam002;

import modifier.exam001.Time;

public class PublicTimeTest {
    public static void main(String[] args){
        Time t = new Time();
        t.hour = -1;
        t.minute = -1;
        t.second = -1;

        System.out.println("Time: " + t.hour + ":" + t.minute + ":" + t.second);
    }
}