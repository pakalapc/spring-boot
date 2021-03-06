package com.example.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.example.config.SqlQueriesConfig;

public class BaseDao extends NamedParameterJdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlQueriesConfig sqls;
	
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

}
