package kr.or.dgit.Mybatis_study_dao;

import java.util.List;

import kr.or.dgit.Mybatis_study_dto.Student;



public interface StudentDao {
	Student findStudentById(int studId);
	void insertStudent(Student student);
    void deleteStudent(int studId);
    List<Student> findAllStudents();
}
