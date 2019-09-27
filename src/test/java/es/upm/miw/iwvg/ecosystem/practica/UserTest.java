package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "sonia", "bejar");
    }

    @Test
    void testUser() {
        assertEquals("Sonia", user.getName());
        assertEquals("Bejar", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Sonia Bejar", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("S.B", user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testSetNumber() {
        user.setNumber(2);
        assertEquals(2, user.getNumber());
    }
}
