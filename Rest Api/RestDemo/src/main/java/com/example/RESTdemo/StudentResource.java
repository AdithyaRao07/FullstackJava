package com.example.RESTdemo;

import jakarta.ws.rs.*;

import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

@Path("student")
public class StudentResource {
    StudentRepo Repo=new StudentRepo();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Student> getStudents(){
        return Repo.getStudentsRepo();
    }
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("student/{sId}")
    public Student getStudent(@PathParam("sId")  int sId){
    return Repo.getStudent(sId);
    }
    @POST
    @Path("students")
    @Consumes(MediaType.APPLICATION_XML)
    public Student createStudent(Student s1){
        Repo.create(s1);
        return s1;
    }
}
