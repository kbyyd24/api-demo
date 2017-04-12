package cn.gaoyuexiang.api.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

  @Id
  private String id;
  private String name;
  private String clazz;
  private double math;
  private double chinese;

  public Student() {
  }

  public Student(String id, String name, String clazz, double math, double chinese) {
    this.id = id;
    this.name = name;
    this.clazz = clazz;
    this.math = math;
    this.chinese = chinese;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }

  public double getMath() {
    return math;
  }

  public void setMath(double math) {
    this.math = math;
  }

  public double getChinese() {
    return chinese;
  }

  public void setChinese(double chinese) {
    this.chinese = chinese;
  }
}
