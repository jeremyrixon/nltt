package org.rixon.nltt.dao;

import java.util.List;

import org.rixon.nltt.model.User;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(UserMapper.class)
public interface UserDao
{
  @SqlQuery("select id, name, phone, email from users")
  List<User> findAll();

  void close();
}