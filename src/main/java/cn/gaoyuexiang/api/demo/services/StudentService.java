package cn.gaoyuexiang.api.demo.services;

import cn.gaoyuexiang.api.demo.model.Student;
import cn.gaoyuexiang.api.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private StudentRepo studentRepo;

  @Autowired
  public StudentService(StudentRepo studentRepo) {
    this.studentRepo = studentRepo;
  }

  public Student addStudent(Student student) {
    return studentRepo.save(student);
  }

  public Student queryStudentById(String id) {
    return studentRepo.findById(id);
  }
}
