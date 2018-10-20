package leif.liu.fantasy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    private MyUtil() {}

    public static String getCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = simpleDateFormat.format(new Date());
        return currentDate;
    }

    public static int getTotalScore(int ... scores) {
        int totalScore = 0;

        for (int score : scores) {
            totalScore += score;
        }

        return totalScore;
    }

    public static String getRankByScore(int score) {
        return score >= 80 ? "S" : score >= 60 ? "A" : score >= 40 ? "B" : score >= 20 ? "C" : "D";
    }
}
