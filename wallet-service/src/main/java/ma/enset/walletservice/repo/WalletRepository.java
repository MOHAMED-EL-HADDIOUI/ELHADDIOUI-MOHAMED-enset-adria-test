package ma.enset.walletservice.repo;

import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface WalletRepository extends JpaRepository<Wallet, UUID> {

}
