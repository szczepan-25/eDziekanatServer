package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.BlokZajec;

@RepositoryRestResource(path = "blokZajec", collectionResourceRel = "blokZajec")
public interface BlokZajecRepository extends PagingAndSortingRepository<BlokZajec, Long> {
}
