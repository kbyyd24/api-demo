package cn.gaoyuexiang.api.demo.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("classes")
public class ClassController {

  @GET
  @Path("{classId}/students/{studentId}/{course}")
  public int queryScore(@PathParam("classId") String classId,
                        @PathParam("studentId") String studentId,
                        @PathParam("course") String course,
                        @HeaderParam("teacher-id") String teacherId,
                        @HeaderParam("query-course") String queryCourse) {
    return 0;
  }

}
