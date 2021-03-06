/**
 * 
 */
package com.synectiks.service.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.synectiks.commons.interfaces.IApiController;

/**
 * @author Rajesh
 */
@RestController
@RequestMapping(path = IApiController.API_PATH
		+ IApiController.URL_RESOURCE, method = RequestMethod.POST)
public class ResourceController implements IApiController {

	private static final Logger logger = LoggerFactory
			.getLogger(ResourceController.class);

	@Override
	public ResponseEntity<Object> findAll(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> create(ObjectNode entity, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> update(ObjectNode entity, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> delete(ObjectNode entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
