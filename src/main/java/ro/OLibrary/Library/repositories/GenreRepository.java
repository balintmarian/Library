package ro.OLibrary.Library.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.OLibrary.Library.models.Genre;

public interface GenreRepository extends CrudRepository<Genre,Integer> {
}
