package leif.liu.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TheSixUniverseDominatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(TheSixUniverseDominatorApplication.class, args);
    }
}
