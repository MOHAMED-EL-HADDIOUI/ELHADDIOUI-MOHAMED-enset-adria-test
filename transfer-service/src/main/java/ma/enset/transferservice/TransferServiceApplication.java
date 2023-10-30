package ma.enset.transferservice;

import ma.enset.transferservice.Services.ClientRestClientService;
import ma.enset.transferservice.Services.WallerRestClientService;
import ma.enset.transferservice.repo.TransferRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class TransferServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TransferServiceApplication.class, args);
	}
}
