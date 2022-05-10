package jp.co.calocalo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) //apring secrityの無効化
public class CalocaloApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalocaloApplication.class, args);
	}

}
