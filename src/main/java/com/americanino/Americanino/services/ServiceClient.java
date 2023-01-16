package com.americanino.Americanino.services;

import com.americanino.Americanino.models.ModelClient;
import com.americanino.Americanino.repository.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient implements Services<ModelClient> {

    @Autowired
    RepositoryClient repositoryClient;

    @Override
    public List<ModelClient> buscarTodos() throws Exception {
        try {
            List<ModelClient> modelClients = repositoryClient.findAll();
            return modelClients;

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public ModelClient guardarClient(ModelClient modelClient) throws Exception {
        try {
            modelClient = repositoryClient.save(modelClient);
            return modelClient;
        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }

}
