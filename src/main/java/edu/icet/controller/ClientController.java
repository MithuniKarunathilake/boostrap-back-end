package edu.icet.controller;
import edu.icet.service.ClientService;
import edu.icet.service.ClientServiceImpl;
import edu.icet.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController//to get network requests into your class
public class ClientController {
    @Autowired
    ClientService service ;
    @GetMapping("/get-client")
    public Client getClient(){
        return service.getClient();
    }

    @PostMapping("/post-client")
    public void addClient(@RequestBody Client client){
        service.addClients(client);
    }
}
