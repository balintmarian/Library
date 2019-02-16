package ro.OLibrary.Library.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.OLibrary.Library.models.Client;

public interface ClientRepository extends CrudRepository<Client,Integer> {
}
