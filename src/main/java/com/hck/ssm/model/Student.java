package com.hck.ssm.model;

public class Student {
    private Integer id;

    private Integer studentid;

    private String password;

    public Student(Integer id, Integer studentid, String password) {
        this.id = id;
        this.studentid = studentid;
        this.password = password;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}