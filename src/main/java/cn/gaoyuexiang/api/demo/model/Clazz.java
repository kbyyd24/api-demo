package cn.gaoyuexiang.api.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Clazz {

  @Id
  private String id;
  private String clazzNumber;

  public Clazz() {}

  public Clazz(String id, String clazzNumber) {
    this.id = id;
    this.clazzNumber = clazzNumber;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getClazzNumber() {
    return clazzNumber;
  }

  public void setClazzNumber(String clazzNumber) {
    this.clazzNumber = clazzNumber;
  }
}
