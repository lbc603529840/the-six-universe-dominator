package leif.liu.fantasy.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.web.multipart.MultipartFile;

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

    public static void uploadFile(MultipartFile multipartFile, String fileName, String fTPPath) {
        FTPClient fTPClient = new FTPClient();
        InputStream inputStream = null;

        try {
            fTPClient.connect("127.0.0.1", 21);
            fTPClient.login("Administrator", "lbc19951022");
            boolean hasDirectory = fTPClient.changeWorkingDirectory(fTPPath);

            if (!hasDirectory) {
                fTPClient.makeDirectory(fTPPath);
            }

            fTPClient.changeWorkingDirectory(fTPPath);
            fTPClient.setFileType(FTP.BINARY_FILE_TYPE);
            inputStream = multipartFile.getInputStream();
            fTPClient.storeFile(fileName, inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                fTPClient.logout();
                fTPClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
