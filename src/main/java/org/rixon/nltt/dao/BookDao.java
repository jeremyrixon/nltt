package org.rixon.nltt.dao;

import java.util.List;

import org.rixon.nltt.model.Book;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(BookMapper.class)
public interface BookDao
{
  @SqlQuery("select b.id, b.title, b.author, b.ISBN "
  		+ " from users u "
		+ " join loans l on l.userid = u.id "
  		+ " join books b on b.id = l.bookid "
		+ " where u.id = :userid")
  List<Book> findByUser(@Bind("userid") int userid);
	
  @SqlQuery("select id, title, author, ISBN from books")
  List<Book> findAll();

  void close();
}