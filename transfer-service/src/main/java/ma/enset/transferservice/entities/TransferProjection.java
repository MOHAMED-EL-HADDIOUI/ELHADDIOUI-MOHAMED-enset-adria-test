package ma.enset.transferservice.entities;
import ma.enset.transferservice.enums.TransferStatus;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullOrder",types=Transfer.class)

public interface TransferProjection {
    public Long getId();
    public Date getDate();
    public TransferStatus getStatus();
    public Long getCustomerId();
    public double getAmount();
}
