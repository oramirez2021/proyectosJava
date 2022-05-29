package com.example.demo.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckWhenStudentEmailExists() {
        String email = "jamila@gmail.com";
        //given
        Student student = new Student("Jamila",email,Gender.FEMALE);
        underTest.save(student);
        //when

        Boolean expected = underTest.selectExistsEmail(email);
        //then
        Assertions.assertTrue(expected);
    }
    @Test
    void itShouldCheckWhenStudentEmailDoesNotExists() {
        //given
        String email = "jamila@gmail.com";
        //when
        Boolean expected = underTest.selectExistsEmail(email);
        //then
        Assertions.assertFalse(expected);
    }
}