package ma.enset.transferservice.models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Wallet {
    private UUID id;
    private Client client;
    private double balance;
    private String currency;
    private Date creationDate;
}
