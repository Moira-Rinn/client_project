package com.smcr.client_onboarding.repositories;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.smcr.client_onboarding.models.ClientBriefModel;

@Repository
public interface ClientBriefRepo extends CrudRepository<ClientBriefModel, Long> {
	List<ClientBriefModel> findAll();
    // Add any custom query methods if needed
}
