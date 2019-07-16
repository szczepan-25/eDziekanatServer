package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Grupa;

@RepositoryRestResource(path = "grupa", collectionResourceRel = "grupa")
public interface GrupaRepository extends PagingAndSortingRepository<Grupa, Long> {
}
