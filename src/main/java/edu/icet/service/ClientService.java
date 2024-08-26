package edu.icet.service;

import edu.icet.dto.Client;

public interface ClientService {
    Client getClient();

    void addClients(Client client);
}
