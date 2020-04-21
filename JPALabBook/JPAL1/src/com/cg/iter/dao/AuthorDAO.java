package com.cg.iter.dao;

import com.cg.iter.bean.Author;

public interface AuthorDAO {

	boolean addAuthor(Author author);

	boolean deleteAuthor(Author author);

	Author updateAuthor(Author author);

	Author findAuthor(Integer id);

}
