package com.example.mapper;
import org.springframework.jdbc.core.RowMapper;

import com.example.domain.Credit_Card;
import com.example.domain.Photographer;
import com.google.gson.Gson;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhotographerRowMapper implements RowMapper<Photographer> {

    @Override
    public Photographer mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Photographer photographer = new Photographer();
    	Gson gson = new Gson();
    	photographer.setCredit_card(gson.fromJson(rs.getString("credit_card"), Credit_Card.class));
    	photographer.setAvatar(rs.getString("avatar"));
        return photographer;
    }
}