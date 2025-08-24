package ku.cs.models;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest{
    static StudentList a;

    @BeforeAll
    static void initial() {
        a = new StudentList();
        a.addNewStudent("6710450619", "Mafuang");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียน")
    void testAddNewStudent() {
        a.addNewStudent("6710450616", "Maf");
        assertEquals(2, a.getStudents().size());
        assertEquals("Maf", a.getStudents().get(1).getName());
    }

    @Test
    @DisplayName(("ทดสอบการหาชื่อ"))
    void testFindStudentById() {
        a.addNewStudent("6710450619", "Mafuang");
        assertEquals("6710450619",a.findStudentById("6710450619").getId());
    }
    @Test
    @DisplayName(("ทดสอบกรองโดยชื่อ"))
    void testFilterByName() {
        a.addNewStudent("6710450616", "Maf");
        a.addNewStudent("6710450618", "Zajow");
        a.addNewStudent("6710450617", "Zaa");
        StudentList b = a.filterByName("Za");
        assertEquals(2, b.getStudents().size());
        assertEquals("Zajow", b.getStudents().get(0).getName());
        assertEquals("Zaa", b.getStudents().get(1).getName());
    }
    @Test
    void testGiveScoreToId() {
        a.addNewStudent("6710450617", "Zaa");
        a.giveScoreToId("6710450617", 100.0);
        assertEquals(100.0, a.findStudentById("6710450617").getScore());
        assertEquals("A",  a.getStudents().get(1).getGrade());
    }
}