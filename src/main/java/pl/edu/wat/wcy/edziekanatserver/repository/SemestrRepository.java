package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Semestr;

@RepositoryRestResource(path = "semestr", collectionResourceRel = "semestr")
public interface SemestrRepository extends PagingAndSortingRepository<Semestr, Long> {
}
