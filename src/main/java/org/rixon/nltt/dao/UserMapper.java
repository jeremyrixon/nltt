package org.rixon.nltt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rixon.nltt.model.User;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class UserMapper implements ResultSetMapper<User>
{
  public User map(int index, ResultSet r, StatementContext ctx) throws SQLException
  {
    return new User(r.getInt("id"), r.getString("name"), r.getString("phone"), r.getString("email"));
  }
}