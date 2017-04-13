package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course, String>{

  Course findById(String id);

}
