package com.example.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
public class SqlQueriesConfig {
	
	Properties selectSqlStatement = new Properties();
	
	public SqlQueriesConfig() throws IOException{
		selectSqlStatement.loadFromXML(this.getClass().getResourceAsStream("/select-sql-queries.xml"));
	}
	
	public String getStatement(SqlType sqlType, String statementName) throws Exception {
		String sql = null;
		
		if(sqlType == SqlType.SELECT)
			sql = (String) this.selectSqlStatement.getProperty(statementName);
		else throw new Exception("msg");
		
		return StringUtils.trimAllWhitespace(sql);
		
	}

}
