package cn.gaoyuexiang.api.demo.controllers;

import cn.gaoyuexiang.api.demo.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("classes")
@Component
public class ClassController {

  private ClassService classService;

  @Autowired
  public ClassController(ClassService classService) {
    this.classService = classService;
  }

  @GET
  @Path("{classId}/students/{studentId}/{course}")
  public double queryScore(@PathParam("classId") String classId,
                        @PathParam("studentId") String studentId,
                        @PathParam("course") String course,
                        @HeaderParam("teacher-id") String teacherId) {
    this.classService.getCourseScore(teacherId, classId, studentId, course);
    return 0;
  }

}
