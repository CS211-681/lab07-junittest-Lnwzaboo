package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.changeName("Imm");
        assertEquals("Imm", s.getName());
    }

    @Test
    @DisplayName("ทดสอบisId")
    void testIsId() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertEquals(false,s.isId("6710450619"));
    }
    @Test
    @DisplayName("ทดสอบisNameContains")
    void testIsNameContains() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertEquals(true, s.isNameContains("Test"));
    }

}

