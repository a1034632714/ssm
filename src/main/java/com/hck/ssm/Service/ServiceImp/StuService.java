package com.hck.ssm.Service.ServiceImp;

import com.hck.ssm.Service.IStuService;
import com.hck.ssm.mapper.StudentMapper;
import com.hck.ssm.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService implements IStuService {
    @Autowired
    private StudentMapper mapper;


    @Override
    public List<Student> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public void update(Student student) {
            mapper.update(student);
    }

    @Override
    public Student searchById(Integer stuid) {
        return mapper.searchById(stuid);
    }

    @Override
    public void deleteById(Integer stuid) {
        mapper.deleteByPrimaryKey(stuid);
    }
}
