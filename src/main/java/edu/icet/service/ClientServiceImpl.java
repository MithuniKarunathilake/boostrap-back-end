package edu.icet.service;

import edu.icet.dto.Client;
import edu.icet.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository repository;
    @Override
    public Client getClient(){
        List<Client> all = repository.findAll();
        all.forEach(obj ->{
            System.out.println(obj);
        });


        return new Client(1,"Mithuni","Makola", LocalDate.of(2003, 6, 21),"A/L","ICD");
    }

    @Override
    public void addClients(Client client) {
        repository.save(client);
    }
}
