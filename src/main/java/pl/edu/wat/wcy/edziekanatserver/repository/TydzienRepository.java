package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Tydzien;

@RepositoryRestResource(path = "tydzien", collectionResourceRel = "tydzien")
public interface TydzienRepository extends PagingAndSortingRepository<Tydzien, Long> {
}
