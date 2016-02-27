package org.rixon.nltt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rixon.nltt.model.Person;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class PersonMapper implements ResultSetMapper<Person>
{
  public Person map(int index, ResultSet r, StatementContext ctx) throws SQLException
  {
    return new Person(r.getInt("id"), r.getString("name"), r.getString("phone"), r.getString("email"));
  }
}