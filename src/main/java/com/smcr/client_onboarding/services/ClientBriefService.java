package com.smcr.client_onboarding.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.smcr.client_onboarding.repositories.ClientBriefRepo;
import com.smcr.client_onboarding.models.ClientBriefModel;

@Service
public class ClientBriefService {

    private final ClientBriefRepo clientBriefRepository;

   // @Autowired
    
    public ClientBriefService(ClientBriefRepo clientBriefRepository) {
        this.clientBriefRepository = clientBriefRepository;
    }

    public List<ClientBriefModel> getAllClientBriefs() {
        return clientBriefRepository.findAll();
    }

    public Optional<ClientBriefModel> findById(Long id) {
        return clientBriefRepository.findById(id);
                //.orElseThrow();// -> new NotFoundException("Client brief not found with id: " + id));
    }

    public ClientBriefModel createClientBrief(ClientBriefModel clientBrief) {
        // Add any necessary business logic/validation here before saving the entity
        return clientBriefRepository.save(clientBrief);
    }

    public ClientBriefModel update(ClientBriefModel clientBrief, Long id) {
    	ClientBriefModel existingClientBrief = clientBriefRepository.findById(id)
                .orElseThrow();// -> new NotFoundException("Client brief not found with id: " + id));

        // Perform update operations on existingClientBrief based on clientBrief

        return clientBriefRepository.save(existingClientBrief);
    }

    public void delete(Long id) {
    	ClientBriefModel existingClientBrief = clientBriefRepository.findById(id)
               .orElseThrow();// -> new NotFoundException("Client brief not found with id: " + id));

        clientBriefRepository.delete(existingClientBrief);
    }
}

