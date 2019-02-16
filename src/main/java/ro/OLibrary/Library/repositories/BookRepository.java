package ro.OLibrary.Library.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.OLibrary.Library.models.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
