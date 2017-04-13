package cn.gaoyuexiang.api.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentClass")
public class StudentClass {

  @Id
  private String id;
  private String studentId;
  private String classId;

  public StudentClass() {}

  public StudentClass(String id, String studentId, String classId) {
    this.id = id;
    this.studentId = studentId;
    this.classId = classId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }
}
