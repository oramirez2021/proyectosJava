package com.example.demo.student;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    private StudentService underTest;
    @Mock private StudentRepository studentRepository;
    @BeforeEach
    void setUp() {
        underTest = new StudentService(studentRepository);
    }

    @Test
    void canGetAllStudents() {
        //when
        underTest.getAllStudents();
        //then
        verify(studentRepository).findAll();
    }

    @Test
    void canAddStudent() {
      //given
        Student student = new Student("jamila","jamila1@gmail.com",Gender.FEMALE);
        //when
        underTest.addStudent(student);
        //then
        ArgumentCaptor<Student>  studentArgumentCaptor = ArgumentCaptor.forClass(Student.class);
        verify(studentRepository).save(studentArgumentCaptor.capture());
        Student studentCaptured = studentArgumentCaptor.getValue();
        Assertions.assertEquals(student,studentCaptured);

    }
    @Test
    void willThrowWhenEmailIsTaken() {
        //given
        Student student = new Student("jamila","jamila1@gmail.com",Gender.FEMALE);
        //when//then 

    }

    @Test
    @Disabled
    void deleteStudent() {
    }
}