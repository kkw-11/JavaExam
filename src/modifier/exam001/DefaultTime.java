package modifier.exam001;

public class DefaultTime {
    public static void main(String[] args){
        Time pt = new Time();
        pt.hour = 25;
        pt.minute = -1;
        pt.second = -1;

        System.out.println("Time: " + pt.hour + ":" + pt.minute + ":" + pt.second);

    }
}
