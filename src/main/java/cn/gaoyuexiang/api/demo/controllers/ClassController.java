package cn.gaoyuexiang.api.demo.controllers;

import cn.gaoyuexiang.api.demo.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("classes")
@Component
public class ClassController {

  private static final String UNAUTHORIZED = "Unauthorized";
  private ClassService classService;

  @Autowired
  public ClassController(ClassService classService) {
    this.classService = classService;
  }

  @GET
  @Path("{classId}/students/{studentId}/{course}")
  public Response queryScore(@PathParam("classId") String classId,
                             @PathParam("studentId") String studentId,
                             @PathParam("course") String course,
                             @HeaderParam("teacher-id") String teacherId) {
    double score = this.classService.getCourseScore(teacherId, classId, studentId, course);
    if (score >= 0) {
      return Response.status(Response.Status.OK).entity(score).build();
    }
    return Response.status(Response.Status.UNAUTHORIZED).entity(UNAUTHORIZED).build();
  }

}
