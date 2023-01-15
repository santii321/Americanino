package com.americanino.Americanino.services;

import com.americanino.Americanino.models.ModelClient;
import com.americanino.Americanino.repository.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClient implements Services{

    @Autowired
    RepositoryClient repositoryClient;
    @Override
    public ModelClient guardarClient(ModelClient modelClient) throws Exception {
        try{
            modelClient = repositoryClient.save(modelClient);
            return modelClient;
        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
}
