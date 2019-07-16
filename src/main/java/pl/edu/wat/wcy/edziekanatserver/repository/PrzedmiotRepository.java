package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Przedmiot;

@RepositoryRestResource(path = "przedmiot", collectionResourceRel = "przedmiot")
public interface PrzedmiotRepository extends PagingAndSortingRepository<Przedmiot, Long> {
}
