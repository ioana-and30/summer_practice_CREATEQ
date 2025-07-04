package com.createq.summerpracticetest.converter;

import com.createq.summerpracticetest.dto.StudentDTO;
import com.createq.summerpracticetest.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentConverter {

    public StudentDTO convert(StudentModel studentModel){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(studentModel.getId());
        studentDTO.setName(studentModel.getName());
        studentDTO.setAge(studentModel.getAge());

        return studentDTO;
    }

    public List<StudentDTO> convertAll(List<StudentModel> studentsModel){
        List<StudentDTO> studentsDTO = new ArrayList<>();

        for(StudentModel studentModel : studentsModel){
            studentsDTO.add(convert(studentModel));
        }

        return studentsDTO;
    }
}
