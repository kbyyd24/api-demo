package cn.gaoyuexiang.api.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherClazz")
public class TeacherClazz {

  @Id
  private String id;
  private String teacherId;
  private String classId;

  public TeacherClazz() {
  }

  public TeacherClazz(String id, String teacherId, String classId) {
    this.id = id;
    this.teacherId = teacherId;
    this.classId = classId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }

  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }
}
