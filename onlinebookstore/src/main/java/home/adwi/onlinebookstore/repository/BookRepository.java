package home.adwi.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import home.adwi.onlinebookstore.entiry.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
