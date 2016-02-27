package org.rixon.nltt.dao;

import java.util.List;

import org.rixon.nltt.model.Person;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(PersonMapper.class)
public interface PersonDao
{
  @SqlQuery("select id, name, phone, email from people")
  List<Person> findAll();

  void close();
}