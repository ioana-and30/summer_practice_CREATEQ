package com.createq.summerpracticetest.converter;

import com.createq.summerpracticetest.dto.SchoolDTO;
import com.createq.summerpracticetest.dto.StudentDTO;
import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SchoolConverter {

    private final StudentConverter studentConverter = new StudentConverter();
    public SchoolDTO convert(SchoolModel schoolModel) {
        SchoolDTO schoolDTO = new SchoolDTO();

        schoolDTO.setId(schoolModel.getId());
        schoolDTO.setName(schoolModel.getName());
        schoolDTO.setStudents(studentConverter.convertAll(schoolModel.getStudents()));

        return schoolDTO;
    }

    public List<SchoolDTO> convertAll(List<SchoolModel> schoolsModel){
        List<SchoolDTO> schoolsDTO = new ArrayList<>();

        for(SchoolModel schoolModel : schoolsModel){
            schoolsDTO.add(convert(schoolModel));
        }

        return schoolsDTO;
    }
}
