package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends CrudRepository<Teacher, String> {

  Teacher findById(String id);

}
