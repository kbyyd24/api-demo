package cn.gaoyuexiang.api.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ClassService {

  public boolean checkAuth(String teacherId,
                           String classId,
                           String studentId,
                           String queryCourse,
                           String teachCourse) {
    return false;
  }

  private boolean checkTeacherAndClass(String teacherId,
                                       String classId) {
    return false;
  }

  private boolean checkClassAndStudent(String classId,
                                       String studentId) {
    return false;
  }

  private boolean checkTeacherAndCourse(String teachCourse,
                                        String queryCourse) {
    return false;
  }

}
