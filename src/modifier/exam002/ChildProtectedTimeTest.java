package modifier.exam002;

import modifier.exam001.Time;

public class ChildProtectedTimeTest extends Time{

    public static void main(String[] args){

        ChildProtectedTimeTest ct = new ChildProtectedTimeTest();

        ct.hour = 10;
        ct.minute = 10;
        ct.second = 30;
    }
}
