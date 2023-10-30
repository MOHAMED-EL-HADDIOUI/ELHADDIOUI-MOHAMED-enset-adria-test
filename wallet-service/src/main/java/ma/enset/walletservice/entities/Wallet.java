package ma.enset.walletservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
    private double balance;
    private String currency;
    private Date creationDate;
}

