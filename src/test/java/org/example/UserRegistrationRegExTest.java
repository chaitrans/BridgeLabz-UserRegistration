package org.example;
import org.junit.Assert;
import org.junit.Test;

/**
 * Performing test cases for first name, last name, Email-id, phoneNumber & Password.
 * @author Chaitra NS
 * @Date 03-08-2021
 */

public class UserRegistrationRegExTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.firstNameValidate("Chaitra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.firstNameValidate("C");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.lastNameValidate("Sherikar");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.lastNameValidate("cns");
        Assert.assertFalse(result);
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 9863632323");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.phoneNumberValidate("9198323723");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
        Assert.assertFalse(result);
    }

}
