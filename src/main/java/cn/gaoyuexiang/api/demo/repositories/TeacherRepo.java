package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher, String> {

  Teacher findById(String id);

}
