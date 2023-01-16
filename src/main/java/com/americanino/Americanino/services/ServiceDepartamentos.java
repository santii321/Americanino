package com.americanino.Americanino.services;

import com.americanino.Americanino.models.ModelClient;
import com.americanino.Americanino.models.ModelDepartamentos;
import com.americanino.Americanino.repository.RepositoryDepartamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDepartamentos implements Services<ModelDepartamentos>{

    @Autowired
    RepositoryDepartamentos repositoryDepartamentos;
    @Override
    public List<ModelDepartamentos> buscarTodos() throws Exception {
        try {
            List<ModelDepartamentos> modelDepartamento = repositoryDepartamentos.findAll();
            return modelDepartamento;

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public ModelDepartamentos guardarClient(ModelDepartamentos entidad) throws Exception {
        return null;
    }
}
