package com.ex.SpringCloudOauth2ApplicationRestful.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.SpringCloudOauth2ApplicationRestful.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

