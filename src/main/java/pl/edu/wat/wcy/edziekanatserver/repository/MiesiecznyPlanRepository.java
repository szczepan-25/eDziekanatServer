package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.MiesiecznyPlan;

@RepositoryRestResource(path = "miesiecznyPlan", collectionResourceRel = "miesiecznyPlan")
public interface MiesiecznyPlanRepository extends PagingAndSortingRepository<MiesiecznyPlan, Long> {
}
