package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Miesiac;

@RepositoryRestResource(path = "miesiac", collectionResourceRel = "miesiac")
public interface MiesiacRepository extends PagingAndSortingRepository<Miesiac, Long> {
}
