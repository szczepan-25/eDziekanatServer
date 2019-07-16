package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.PoczatekBloku;

@RepositoryRestResource(path = "poczatekBloku", collectionResourceRel = "poczatekBloku")
public interface PoczatekBlokuRepository extends PagingAndSortingRepository<PoczatekBloku, Long> {
}
