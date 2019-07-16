package pl.edu.wat.wcy.edziekanatserver.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.wat.wcy.edziekanatserver.domain.Student;

@RepositoryRestResource(path = "student", collectionResourceRel = "student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
