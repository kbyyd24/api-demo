package cn.gaoyuexiang.api.demo.services;

import cn.gaoyuexiang.api.demo.model.StudentClass;
import cn.gaoyuexiang.api.demo.model.TeacherClazz;
import cn.gaoyuexiang.api.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

  private final TeacherRepo teacherRepo;
  private final CourseRepo courseRepo;
  private StudentCourseRepo studentCourseRepo;
  private final TeacherClazzRepo teacherClazzRepo;
  private final StudentClassRepo studentClassRepo;

  @Autowired
  public ClassService(TeacherRepo teacherRepo,
                      CourseRepo courseRepo,
                      StudentCourseRepo studentCourseRepo,
                      TeacherClazzRepo teacherClazzRepo,
                      StudentClassRepo studentClassRepo) {
    this.teacherRepo = teacherRepo;
    this.courseRepo = courseRepo;
    this.studentCourseRepo = studentCourseRepo;
    this.teacherClazzRepo = teacherClazzRepo;
    this.studentClassRepo = studentClassRepo;
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
    TeacherClazz teacherClazz = this.teacherClazzRepo.findByTeacherIdAndClassId(teacherId, classId);
    return teacherClazz != null;
  }

  private boolean checkClassAndStudent(String classId,
                                       String studentId) {
    StudentClass studentClass = this.studentClassRepo.findByStudentIdAndClassId(studentId, classId);
    return studentClass != null;
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
      return studentCourseRepo.findByStudentIdAndCourseName(studentId, queryCourse).getScore();
    }
    return -1;
  }

}
