package com.americanino.Americanino.repository;

import com.americanino.Americanino.models.ModelClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends JpaRepository<ModelClient, Integer> {
}
