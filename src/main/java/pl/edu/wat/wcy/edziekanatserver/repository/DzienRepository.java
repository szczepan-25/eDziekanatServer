package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Dzien;

@RepositoryRestResource(path = "dzien", collectionResourceRel = "dzien")
public interface DzienRepository extends PagingAndSortingRepository<Dzien, Long> {
}
