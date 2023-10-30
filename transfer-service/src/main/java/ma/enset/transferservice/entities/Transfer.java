package ma.enset.transferservice.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.transferservice.enums.TransferStatus;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID sourceWallet;
    private UUID destinationWallet;

    private double amount;
    private Date date;
    private TransferStatus status;

    // Getters and setters
}
