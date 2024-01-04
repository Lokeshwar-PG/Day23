import org.example.userregistration.InvalidUserDetailsException;
import org.example.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testFirstName() {
        Assertions.assertThrows(InvalidUserDetailsException.class, () -> {
            userRegistration.validateFirstName("Lokesh");
        });
    }

    @Test
    public void testLastName() {
        Assertions.assertThrows(InvalidUserDetailsException.class, () -> {
            userRegistration.validateLastName("kumar");
        });
    }

    @Test
    public void testEmail() {
        Assertions.assertThrows(InvalidUserDetailsException.class, () -> {
            userRegistration.validateEmail("xyz@bl.co.in");
        });
    }

    @Test
    public void testMobile() {
        Assertions.assertThrows(InvalidUserDetailsException.class, () -> {
            userRegistration.validateMobile("1234567890");
        });
    }

    @Test
    public void testPassword() {
        Assertions.assertThrows(InvalidUserDetailsException.class, () -> {
            userRegistration.validatePassword("Lokesh_123");
        });
    }
}
