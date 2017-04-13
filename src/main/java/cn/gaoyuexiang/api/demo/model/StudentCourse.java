package cn.gaoyuexiang.api.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentCourse")
public class StudentCourse {

  @Id
  private String id;
  private String studentId;
  private String courseName;
  private double score;

  public StudentCourse() {
  }

  public StudentCourse(String id, String studentId, String courseName, double score) {
    this.id = id;
    this.studentId = studentId;
    this.courseName = courseName;
    this.score = score;
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

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}
