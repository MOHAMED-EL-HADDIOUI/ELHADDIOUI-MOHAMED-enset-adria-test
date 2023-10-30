package ma.enset.transferservice.web;

import ma.enset.transferservice.Services.ClientRestClientService;
import ma.enset.transferservice.Services.WallerRestClientService;
import ma.enset.transferservice.entities.Transfer;
import ma.enset.transferservice.models.Wallet;
import ma.enset.transferservice.repo.TransferRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletsRestController {
    private TransferRepository transferRepository;
    private WallerRestClientService wallerRestClientService;
    private ClientRestClientService clientRestClientService;


    public WalletsRestController(TransferRepository transferRepository, WallerRestClientService wallerRestClientService, ClientRestClientService clientRestClientService) {
        this.transferRepository = transferRepository;
        this.wallerRestClientService = wallerRestClientService;
        this.clientRestClientService = clientRestClientService;
    }

    @GetMapping("/getTransfer/{id}")
    public Transfer getTransfer(@PathVariable Long id){
        Transfer transfer = transferRepository.findById(id).get();
        Wallet wallets = wallerRestClientService.walletById(transfer.getSourceWallet());
        Wallet walletd= wallerRestClientService.walletById(transfer.getDestinationWallet());
        transfer.setSourceWallet(wallets);
        transfer.setDestinationWallet(walletd);
        return transfer;
    }
}
