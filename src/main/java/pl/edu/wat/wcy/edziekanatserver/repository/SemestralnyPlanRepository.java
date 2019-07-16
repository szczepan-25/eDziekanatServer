package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.SemestralnyPlan;

@RepositoryRestResource(path = "semstralnyPlan", collectionResourceRel = "semestralnyPlan")
public interface SemestralnyPlanRepository extends PagingAndSortingRepository<SemestralnyPlan, Long> {
}
