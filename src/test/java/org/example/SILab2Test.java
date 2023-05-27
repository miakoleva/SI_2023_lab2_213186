package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SILab2Test {

    private SILab2.User user;
    private List<SILab2.User> allUsers;

    @BeforeEach
    void setUp() {
        user = new SILab2.User("testUser", "testPassword", "test@example.com");
        allUsers = new ArrayList<>();
    }

    @Test
    void testFunctionWithValidUser() {
        boolean result = SILab2.function(user, allUsers);
        Assertions.assertTrue(result);
    }

    @Test
    void testFunctionWithNullUser() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(null, allUsers);
        });
    }

    @Test
    void testFunctionWithNullPassword() {
        user.setPassword(null);
        Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });
    }

    @Test
    void testFunctionWithNullEmail() {
        user.setEmail(null);
        Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });
    }

    @Test
    void testFunctionWithNullUsername() {
        user.setUsername(null);
        SILab2.function(user, allUsers);
        Assertions.assertEquals(user.getEmail(), user.getUsername());
    }

    @Test
    void testFunctionWithExistingEmail() {
        SILab2.User existingUser = new SILab2.User("existingUser", "existingPassword", "test@example.com");
        allUsers.add(existingUser);

        boolean result = SILab2.function(user, allUsers);
        Assertions.assertFalse(result);
    }

    @Test
    void testFunctionWithExistingUsername() {
        SILab2.User existingUser = new SILab2.User("testUser", "Interfood123!", "existing@example.com");
        allUsers.add(existingUser);

        boolean result = SILab2.function(user, allUsers);
        Assertions.assertFalse(result);
    }

    @Test
    void testFunctionWithInvalidPasswordContainingUsername() {
        user.setPassword("testUserPassword");
        boolean result = SILab2.function(user, allUsers);
        Assertions.assertFalse(result);
    }

    @Test
    void testFunctionWithInvalidShortPassword() {
        user.setPassword("short");
        boolean result = SILab2.function(user, allUsers);
        Assertions.assertFalse(result);
    }

    @Test
    void testFunctionWithInvalidPasswordMissingSpecialCharacter() {
        user.setPassword("TestUserPassword123");
        boolean result = SILab2.function(user, allUsers);
        Assertions.assertFalse(result);
    }

    @Test
    void testFunctionWithValidPassword() {
        user.setPassword("MiaPassword!123");
        boolean result = SILab2.function(user, allUsers);
        Assertions.assertTrue(result);
    }
}