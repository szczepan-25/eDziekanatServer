package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.DziennyPlan;

@RepositoryRestResource(path = "dziennyPlan", collectionResourceRel = "dziennyPlan")
public interface DziennyPlanRepository extends PagingAndSortingRepository<DziennyPlan, Long> {
}