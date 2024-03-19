package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.book;

public interface BookRepository extends CrudRepository<book,Integer>{
}
