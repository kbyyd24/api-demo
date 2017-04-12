package cn.gaoyuexiang.api.demo.controllers;

import cn.gaoyuexiang.api.demo.model.Student;
import cn.gaoyuexiang.api.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("student")
@Component
public class StudentController {

  private StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @POST
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public Student addStudent(Student student) {
    return this.studentService.addStudent(student);
  }

  @GET
  @Path("{id}")
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public Student queryStudent(@PathParam("id") String id) {
    return this.studentService.queryStudentById(id);
  }
}
