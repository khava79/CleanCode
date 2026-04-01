package ArrTasks;

import java.util.Random;

public class RandomUtil {
    private static final Random RANDOM = new Random();
    public static int getRandom() {
        return RANDOM.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        int number = RandomUtil.getRandom();
        System.out.println(number);
    }
}

