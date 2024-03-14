package support;

import java.util.NoSuchElementException;

public class Helper {

    public static String getUrlFor(String name) {
        switch (name) {
            case "landing page":
                return "http://ask-qa.portnov.com/#/login";
            case "Registration":
                return "http://ask-qa.portnov.com/#/registration";
            default:
                return "";
        }
    }

    public static String getXpathFor(String name) {
        switch (name) {
            case "Register Now":
                return "//button/span[contains(text(), \"Register Now\")]";
            case "First Name":
                return "//input[@formcontrolname='firstName']";
            case "Last Name":
                return "//input[@formcontrolname='lastName']";
            case "Email":
                return "//input[@formcontrolname='email']";
            case "Group Code":
                return "//input[@formcontrolname='group']";
            case "Password":
                return "//input[@formcontrolname='password']";
            case "Confirm Password":
                return "//input[@formcontrolname='confirmPassword']";
            case "Register Me":
                return "//button/span[text()=\"Register Me\"]";
            case "successful registration":
                return "//mat-card/h4[text()='You have been Registered.']";
            case "confirmation message":
                return "(//p)[2]";
            case "sysMes":
                return "//simple-snack-bar[contains(text(),\"Data too long for column 'name' at row 1\")]";
            case "errorMessage1":
                return "//*/mat-error[text()='Should contain only latin characters']";
            case "Empty Space":
                return "//ac-registration-page";
            case "errorMessage2":
                return "//mat-error[text()='This field is required']";
            default:
                return "";
        }
    }

    public static String getString(String name) {
        switch (name) {
            case "Latin character":
                return "Tester";
            case "254 characters":
                return "Tuoiflkjbxytqwrefhgafsbcvnxzbcgghjasfqyutfhasvnbcgsywghscgshtwhfuhgsnbfguwjhgfwgfhgshkjcbhfhqwehfoiashklcnakjskdfjhwefhoishdlfheskjdbfkjwehfiohaslhljkfesbfglhefihaslkncljksdbvjleqwhfpqjfvlnvkncxvmbnjsbgkjhwleifhaslkjckadfjlkqkjqaebfkjkzbxjcvblanb";
            case "1 character":
                return "T";
            case "Name with space":
                return "Test user";
            case "More than 254 characters":
                return "Tuoiflkjbxytqwwerefhgafsbcvnxzbcgghjasfqyutfhasvnbcgsywghscgshtwhfuhgsnbfguwjhgfwgfhgshkjcbhfhqwehfoiashklcnakjskdfjhwefhoishdlfheskjdbfkjwehfiohaslhljkfesbfglhefihaslkncljksdbvjleqwhfpqjfvlnvkncxvmbnjsbgkjhwleifhaslkjckadfjlkqkjqaebfkjkzbxjcvblanb";
            case "Special Character":
                return "#%&^(*@!";
            case " Tester ":
                return " Tester ";
            case "Test er":
                return "Test er";
            default:
                return "";
        }
    }
}