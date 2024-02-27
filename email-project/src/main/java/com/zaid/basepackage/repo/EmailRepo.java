package com.zaid.basepackage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaid.basepackage.request.Email;
import com.zaid.basepackage.request.UserTable;

public interface EmailRepo extends JpaRepository<Email, Integer> {


	List<Email> findByFromAndDeleteSentMailAndEmailDrafts(String email,int deleted,int drafts);

	List<Email> findByToAndDeleteInboxMail(String email,int deleted);

	List<Email> findByFromAndEmailDrafts(String from, int drafts);

	

}
