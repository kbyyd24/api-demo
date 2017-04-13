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
  private String courseId;
  private double score;

  public StudentCourse() {
  }

  public StudentCourse(String id, String studentId, String courseId, double score) {
    this.id = id;
    this.studentId = studentId;
    this.courseId = courseId;
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

  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}
