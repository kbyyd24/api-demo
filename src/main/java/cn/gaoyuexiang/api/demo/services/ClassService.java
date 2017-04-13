package cn.gaoyuexiang.api.demo.services;

import cn.gaoyuexiang.api.demo.repositories.CourseRepo;
import cn.gaoyuexiang.api.demo.repositories.StudentRepo;
import cn.gaoyuexiang.api.demo.repositories.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

  private final TeacherRepo teacherRepo;
  private final StudentRepo studentRepo;
  private final CourseRepo courseRepo;

  @Autowired
  public ClassService(TeacherRepo teacherRepo, StudentRepo studentRepo, CourseRepo courseRepo) {
    this.teacherRepo = teacherRepo;
    this.studentRepo = studentRepo;
    this.courseRepo = courseRepo;
  }

  public boolean checkAuth(String teacherId,
                           String classId,
                           String studentId,
                           String queryCourse) {
    return false;
  }

  private boolean checkTeacherAndClass(String teacherId,
                                       String classId) {
//    only one class
    return true;
  }

  private boolean checkClassAndStudent(String classId,
                                       String studentId) {
//    only one class
    return true;
  }

  private boolean checkTeacherAndCourse(String teacherId,
                                        String queryCourse) {
    String teacherCourse = teacherRepo.findById(teacherId).getCourseId();
    return courseRepo.findById(teacherCourse).getName().equals(queryCourse);
  }

}
