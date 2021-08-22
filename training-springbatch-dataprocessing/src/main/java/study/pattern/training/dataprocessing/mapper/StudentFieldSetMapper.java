package study.pattern.training.dataprocessing.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import study.pattern.training.dataprocessing.model.Student;

public class StudentFieldSetMapper implements FieldSetMapper<Student> {

	@Override
	public Student mapFieldSet(FieldSet fieldSet) throws BindException {
		Student student = new Student();
		student.setRollnumber(fieldSet.readInt(0));
		student.setName(fieldSet.readString(1));
		student.setMarks(fieldSet.readInt(2));
		student.setGrade(fieldSet.readString(3));
		System.out.println("The Student object sent to Proccessor"+student);
		return student;
	}
}
