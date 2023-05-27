//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SILab2Test {
//
//    @Test
//    public <User> void testFunction() {
//
//        // Test case 1: Mandatory information missing
//        User user1 = new User(null, null, null);
//        List<User> allUsers1 = new ArrayList<>();
//        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user1, allUsers1));
//
//        // Test case 2: Username is null
//        User user2 = new User(null, "test@example.com", "password");
//        List<User> allUsers2 = new ArrayList<>();
//        Assertions.assertEquals(true, SILab2.function(user2, allUsers2));
//        Assertions.assertEquals("test@example.com", user2.getUsername());
//
//        // Test case 3: Email and username already exist
//        User user3 = new User("existinguser", "existinguser@example.com", "password");
//        List<User> allUsers3 = new ArrayList<>();
//        allUsers3.add(user3);
//        Assertions.assertEquals(false, SILab2.function(user3, allUsers3));
//
//        // Test case 4: Email and username are unique
//        User user4 = new User("newuser", "newuser@example.com", "password");
//        List<User> allUsers4 = new ArrayList<>();
//        allUsers4.add(user3);
//        Assertions.assertEquals(true, SILab2.function(user4, allUsers4));
//
//        // Test case 5: Password contains username and length < 8
//        User user5 = new User("user", "user@example.com", "password");
//        List<User> allUsers5 = new ArrayList<>();
//        Assertions.assertEquals(false, SILab2.function(user5, allUsers5));
//
//        // Test case 6: Password contains special character and no spaces
//        User user6 = new User("user", "user@example.com", "pass!word");
//        List<User> allUsers6 = new ArrayList<>();
//        Assertions.assertEquals(true, SILab2.function(user6, allUsers6));
//    }
//}
//
