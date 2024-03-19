package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.student;

public interface StudentRepository extends CrudRepository<student,Integer> {

}
