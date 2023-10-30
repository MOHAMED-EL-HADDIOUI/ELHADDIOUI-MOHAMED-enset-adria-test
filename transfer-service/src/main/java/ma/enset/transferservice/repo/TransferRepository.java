package ma.enset.transferservice.repo;

import ma.enset.transferservice.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransferRepository extends JpaRepository<Transfer, UUID> {

}
