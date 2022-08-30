package modifier.exam003;

public class PrivateTimeTest {
    public static void main(String[] args) {
        PrivateTime privateTime = new PrivateTime();

//        privateTime.time = 10;
        privateTime.setHour(-1);
        privateTime.setMinute(-1);
        privateTime.setSecond(-1);

        System.out.println("Time:" + privateTime.getHour() +":" + privateTime.getMinute() + ":" + privateTime.getSecond());

        privateTime.setHour(10);
        privateTime.setMinute(30);
        privateTime.setSecond(11);

        System.out.println("Time:" + privateTime.getHour() + ":" + privateTime.getMinute() + ":" + privateTime.getSecond());

    }
}
