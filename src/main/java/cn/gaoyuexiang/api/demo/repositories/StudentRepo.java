package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, String> {

  Student findById(String id);

}
