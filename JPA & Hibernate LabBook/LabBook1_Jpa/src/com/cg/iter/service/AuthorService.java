package com.cg.iter.service;

import com.cg.iter.entity.Author;

public interface AuthorService {

	boolean create(Author auth);

	Author getAuthor(int authorid);

	boolean update(Author auth);

	boolean delete(Author auth);



}
