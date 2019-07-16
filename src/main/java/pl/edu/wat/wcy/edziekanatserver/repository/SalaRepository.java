package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Sala;

@RepositoryRestResource(path = "sala", collectionResourceRel = "sala")
public interface SalaRepository extends PagingAndSortingRepository<Sala, Long> {
}
