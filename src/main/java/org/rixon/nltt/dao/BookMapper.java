package org.rixon.nltt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rixon.nltt.model.Book;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class BookMapper implements ResultSetMapper<Book>
{
  public Book map(int index, ResultSet r, StatementContext ctx) throws SQLException
  {
    return new Book(r.getInt("id"), r.getString("title"), r.getString("author"), r.getString("ISBN"));
  }
}