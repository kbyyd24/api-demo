package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.StudentClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassRepo extends CrudRepository<StudentClass, String> {

  StudentClass findByStudentIdAndClassId(String studentId, String classId);

}
