package ma.enset.transferservice.Services;

import ma.enset.transferservice.models.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="wallet-service")
public interface ClientRestClientService {
    @GetMapping("/client/{id}?projection=fullClient")
    public Client customerById(@PathVariable Long id);
    @GetMapping("/clients?projection=fullClient")
    public PagedModel<Client> allcustomers();
}
