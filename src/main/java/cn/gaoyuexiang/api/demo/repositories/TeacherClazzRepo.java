package cn.gaoyuexiang.api.demo.repositories;

import cn.gaoyuexiang.api.demo.model.TeacherClazz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherClazzRepo extends CrudRepository<TeacherClazz, String> {

  TeacherClazz findByTeacherIdAndClassId(String teacherId, String classId);

}
