package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Rok;

@RepositoryRestResource(path = "rok", collectionResourceRel = "rok")
public interface RokRepository extends PagingAndSortingRepository<Rok, Long> {
}
