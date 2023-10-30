package ma.enset.transferservice.Services;

import ma.enset.transferservice.models.Client;
import ma.enset.transferservice.models.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="wallet-service")
public interface WallerRestClientService {
    @GetMapping("/wallet/{id}?projection=fullWallet")
    public Wallet walletById(@PathVariable Long id);
    @GetMapping("/wallets?projection=fullWallet")
    public PagedModel<Wallet> allwallets();
}
