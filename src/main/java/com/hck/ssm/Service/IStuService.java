package com.hck.ssm.Service;

import com.hck.ssm.model.Student;

import java.util.List;

public interface IStuService {
    public List<Student> selectAll();
    public void update(Student student);
    public Student searchById(Integer stuid);
    public void deleteById(Integer stuid);
}
