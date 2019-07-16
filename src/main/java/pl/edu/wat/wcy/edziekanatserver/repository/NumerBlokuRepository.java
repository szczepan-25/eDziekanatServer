package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.NumerBloku;

@RepositoryRestResource(path = "numerBloku", collectionResourceRel = "numerBloku")
public interface NumerBlokuRepository extends PagingAndSortingRepository<NumerBloku, Long> {
}
