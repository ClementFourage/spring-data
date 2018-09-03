package com.formation.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

public class MessageMapper<T> implements RowMapper {
	
	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		Message message = new Message();
		message.setId(rs.getInt("id"));
		message.setFromUser(rs.getString("fromUser"));
		message.setToUser(rs.getString("toUser"));
		message.setContent(rs.getString("content"));
		message.setEventTime(rs.getTimestamp("event_Time").toLocalDateTime());
		return (T) message;
	}
}