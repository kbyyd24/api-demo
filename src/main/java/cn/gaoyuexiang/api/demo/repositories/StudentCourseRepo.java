package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.StudentCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepo extends CrudRepository<StudentCourse, String> {

  StudentCourse findByStudentIdAndCourseId(String studentId, String courseId);

}
