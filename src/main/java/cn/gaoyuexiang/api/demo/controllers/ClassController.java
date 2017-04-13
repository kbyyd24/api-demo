package cn.gaoyuexiang.api.demo.controllers;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("classes")
@Component
public class ClassController {

  @GET
  @Path("{classId}/students/{studentId}/{course}")
  public int queryScore(@PathParam("classId") String classId,
                        @PathParam("studentId") String studentId,
                        @PathParam("course") String course,
                        @HeaderParam("teacher-id") String teacherId,
                        @HeaderParam("teach-course") String teachCourse) {
    return 0;
  }

}
