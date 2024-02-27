package com.zaid.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component

public interface ForRepoUse extends JpaRepository<ForTable, Integer>{

}
