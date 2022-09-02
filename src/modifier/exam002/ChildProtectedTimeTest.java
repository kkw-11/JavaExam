package modifier.exam002;

import modifier.exam001.Time;

public class ChildProtectedTimeTest extends Time{

    public static void main(String[] args){

        ChildProtectedTimeTest ct = new ChildProtectedTimeTest();

        ct.hour = 10;
        ct.minute = 10;
        ct.second = 30;
<<<<<<< HEAD

        System.out.println(ct.hour + ":" + ct.minute + ":" + ct.second);
=======
>>>>>>> 771f2daa99dd15e3e55cc0ddba13e3abc86bae88
    }
}
