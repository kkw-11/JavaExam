package stream;

import java.util.stream.IntStream;

public class Exam {
    public static void main(String[] args) {
        int total = 0;
//        for(int number = 1; number <= 100;++number){
//            if(number % 2 == 1) System.out.println(number);
//            total += number;
//        }
//        System.out.println(total);
//
//        total = 0;

        int[] oneToHundred = IntStream.range(1,101).toArray();

        for (int number: oneToHundred) {
            if(number % 2 == 1) System.out.println(number);
            total += number;

        }
        System.out.println(total);
        System.out.println(IntStream.range(1, 101).filter(i -> i % 2 == 1));

    }
}
