package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.TygodniowyPlan;

@RepositoryRestResource(path = "tygodniowyPlan", collectionResourceRel = "tygodniowyPlan")
public interface TygodniowyPlanRepository extends PagingAndSortingRepository<TygodniowyPlan, Long> {
}
