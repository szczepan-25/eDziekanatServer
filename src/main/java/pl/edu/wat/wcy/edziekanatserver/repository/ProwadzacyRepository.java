package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Prowadzacy;

@RepositoryRestResource(path = "prowadzacy", collectionResourceRel = "prowadzacy")
public interface ProwadzacyRepository extends PagingAndSortingRepository<Prowadzacy, Long> {
}
