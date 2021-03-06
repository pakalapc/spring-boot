package com.example.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.BaseDao;
import com.example.dao.ExampleDao;
import com.example.domain.Photographer;
import com.example.mapper.PhotographerRowMapper;
import com.google.gson.Gson;


@Repository
@Transactional
public class ExampleDaoImpl extends BaseDao implements ExampleDao{

	private NamedParameterJdbcTemplate getDbTemplate() {
		NamedParameterJdbcTemplate template = getNamedParameterJdbcTemplate();
		return template; 	
	}
	@Override
	public String getExampleDao() {
		String result = "Failed";
		try {			
//			String query = sqls.getStatement(SqlType.SELECT, NcsrConstants.GET_BENEFIT_DETAILS);
			String query = "SELECT 'ABCDEF12345' FROM DUAL";
			Map<String, Object> params = new HashMap<>();
			result = getDbTemplate().queryForObject(query, params, String.class);	
			
		} catch (Exception ex) {			
			
		}
		return result;
	}
	
	@Override
	public List<Photographer> getAll() {
		List<Photographer> result;
		try {			
//			String query = sqls.getStatement(SqlType.SELECT, NcsrConstants.GET_BENEFIT_DETAILS);
			String query = "SELECT * FROM photographer";
			Map<String, Object> params = new HashMap<>();
			result = getDbTemplate().query(query, params, new PhotographerRowMapper());	
			return result;
		} catch (Exception ex) {			
			logger.error(ex);
			throw new IllegalArgumentException(ex);
		}
	}
	
	@Override
	public int create(Photographer photographer) {
		try {			
//			String query = sqls.getStatement(SqlType.SELECT, NcsrConstants.GET_BENEFIT_DETAILS);
			String query = "Insert into photographer (\n"
					+ " id,\n"
					+ " uid,\n"
					+ "password,\n"
					+ "first_name,\n"
					+ "last_name,\n"
					+ "username,\n"
					+ "email,\n"
					+ "avatar,\n"
					+ "gender,\n"
					+ "phone_number,\n"
					+ "social_insurance_number,\n"
					+ "date_of_birth,\n"
					+ "event_type,\n"
					+ "address,\n"
					+ "credit_card,\n"
					+ "subscription\n"
					+ ") VALUES (:id, :uid, :password, :first_name, :last_name, :username, :email, :avatar, :gender, :phone_number, :social_insurance_number, :date_of_birth, :event_type, :address, :credit_card, :subscription)";
			
			Map<String, Object> params = new HashMap<>();
			params.put("id", photographer.getId());
			params.put("uid", photographer.getUid());
			params.put("password", photographer.getPassword());
			params.put("first_name", photographer.getFirst_name());
			params.put("last_name", photographer.getLast_name());
			params.put("username", photographer.getUsername());
			
			params.put("email", photographer.getEmail());
			params.put("avatar", photographer.getAvatar());
			params.put("gender", photographer.getGender());
			params.put("phone_number", photographer.getPhone_number());
			params.put("social_insurance_number", photographer.getSocial_insurance_number());
			
			params.put("date_of_birth", photographer.getDate_of_birth());
			params.put("event_type", new Gson().toJson(photographer.getEvent_type()));
			params.put("address", new Gson().toJson(photographer.getAddress()));
			params.put("credit_card", new Gson().toJson(photographer.getCredit_card()));
			params.put("subscription", new Gson().toJson(photographer.getSubscription()));
			
			int update = getDbTemplate().update(query, params);	
			return update;
		} catch (Exception ex) {			
			logger.error(ex);
			throw new IllegalArgumentException(ex);
		}
	}
	
	

}
