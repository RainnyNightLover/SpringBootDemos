package com.xihuanyuye.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.xihuanyuye.model.Book;

/**
 * 描述:
 *
 * @author yanpenglei
 * @create 2017-11-02 14:47
 **/
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    Page<Book> findByAuthor(String author, Pageable pageable);

    List<Book> findByTitle(String title);

    Book save(Book book);
}