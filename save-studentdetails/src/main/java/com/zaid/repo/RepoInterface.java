package com.zaid.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zaid.model.Model1;
@Component
public interface RepoInterface extends JpaRepository<Model1, Integer> {

}
