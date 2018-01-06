/**
 * 
 */
package com.synectiks.service.repositories;

import org.springframework.stereotype.Repository;

import com.synectiks.commons.entities.dynamodb.Service;
import com.synectiks.schemas.repositories.DynamoDbRepository;

/**
 * @author Rajesh
 */
@Repository
public class ServiceRepository extends DynamoDbRepository<Service, String> {

	public ServiceRepository() {
		super(Service.class);
	}

}
