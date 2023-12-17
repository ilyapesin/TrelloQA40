package utils;

import java.util.Random;

public class RandomUtils {
    Random random = new Random();
    public String createRandomString(int length) {
        String res="";
        String chars="abcdefghijklmnopqrstuvwxyz";
        int index=0;
       // int strLength=chars.length();
        for (int i=0; i<length; i++) {
            index=random.nextInt(26);
            res+=chars.charAt(index);

        }
        return res;

    }
}
