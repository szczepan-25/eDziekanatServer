package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Budynek;

@RepositoryRestResource(path = "budynek", collectionResourceRel = "budynek")
public interface BudynekRepository extends PagingAndSortingRepository<Budynek, Long> {
}
