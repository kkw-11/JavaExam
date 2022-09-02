package modifier.exam003;

public class PrivateTime {
    private int hour;
<<<<<<< HEAD
    private int minute;
=======
    private int minute ;
>>>>>>> 771f2daa99dd15e3e55cc0ddba13e3abc86bae88
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }
<<<<<<< HEAD
=======

>>>>>>> 771f2daa99dd15e3e55cc0ddba13e3abc86bae88
    public int getMinute() {
        return minute ;
    }

    public void setMinute(int minute ) {
        if(minute  < 0 || minute  > 59) return;
        this.minute  = minute ;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second  < 0 || second  > 59) return;
        this.second = second;
    }

<<<<<<< HEAD
=======

>>>>>>> 771f2daa99dd15e3e55cc0ddba13e3abc86bae88
}
