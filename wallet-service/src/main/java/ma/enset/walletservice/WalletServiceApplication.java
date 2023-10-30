package ma.enset.walletservice;

import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.entities.Wallet;
import ma.enset.walletservice.repo.ClientRepository;
import ma.enset.walletservice.repo.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
		return args -> {
			for(int i=0;i<10;i++)
			{
				Client client = new Client();
				client.setName("mohamed"+i);
				client.setEmail("mohamed"+i+"@gmail.com");
				Client client1 = clientRepository.save(client);
				Wallet wallet  = new Wallet();
				wallet.setBalance(Math.random()*1000+2999);
				wallet.setClient(client1);
				wallet.setCurrency("Currency");
				wallet.setCreationDate(new Date());
				walletRepository.save(wallet);
			}
		};
	}
}
