package com.Skamarah;

import com.Skamarah.fplpulse.service.FplPulseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FplProjectApplication {

	@Autowired
	FplPulseService fplPulseService;

	public static void main(String[] args) {
		SpringApplication.run(FplProjectApplication.class, args);

	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			fplPulseService.getLiveGameweekData(27)
					.subscribe(System.out::println);
		};
	}

}
