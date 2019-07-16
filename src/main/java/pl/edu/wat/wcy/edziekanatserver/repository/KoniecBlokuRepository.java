package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.KoniecBloku;

@RepositoryRestResource(path = "koniecBloku", collectionResourceRel = "koniecBloku")
public interface KoniecBlokuRepository extends PagingAndSortingRepository<KoniecBloku, Long> {
}
