package com.mellora.mhw.builder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BuilderRepository {

	@Autowired
	NamedParameterJdbcTemplate template;
	
	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}
	
}
