package cn.gaoyuexiang.api.demo.services;

import cn.gaoyuexiang.api.demo.repositories.CourseRepo;
import cn.gaoyuexiang.api.demo.repositories.StudentCourseRepo;
import cn.gaoyuexiang.api.demo.repositories.StudentRepo;
import cn.gaoyuexiang.api.demo.repositories.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

  private final TeacherRepo teacherRepo;
  private final StudentRepo studentRepo;
  private final CourseRepo courseRepo;
  private StudentCourseRepo studentCourseRepo;

  @Autowired
  public ClassService(TeacherRepo teacherRepo,
                      StudentRepo studentRepo,
                      CourseRepo courseRepo,
                      StudentCourseRepo studentCourseRepo) {
    this.teacherRepo = teacherRepo;
    this.studentRepo = studentRepo;
    this.courseRepo = courseRepo;
    this.studentCourseRepo = studentCourseRepo;
  }

  private boolean checkAuth(String teacherId,
                            String classId,
                            String studentId,
                            String queryCourse) {
    return
        this.checkTeacherAndClass(teacherId, classId) &&
        this.checkClassAndStudent(classId, studentId) &&
        this.checkTeacherAndCourse(teacherId, queryCourse);
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

  public double getCourseScore(String teacherId,
                            String classId,
                            String studentId,
                            String queryCourse) {
    boolean isAuth = this.checkAuth(teacherId, classId, studentId, queryCourse);
    if (isAuth) {
      return studentCourseRepo.findByStudentIdAndCourseId(studentId, queryCourse).getScore();
    }
    return -1;
  }

}
