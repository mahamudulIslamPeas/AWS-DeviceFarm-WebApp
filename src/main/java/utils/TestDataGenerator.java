package utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Random;

public class TestDataGenerator {
    Faker faker = new Faker();
    public String givenName(){
        return faker.name().firstName();
    }
    public String surName(){
        return faker.name().lastName();
    }
    public String emailAddress(){
        return givenName().toLowerCase() + surName().toLowerCase() + "_test@yopmail.com";
    }
    public String generateRandomPhoneNumber() {
        // Create a StringBuilder to build the phone number
        StringBuilder phoneNumberBuilder = new StringBuilder("0");

        // Generate 9 random digits
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            int digit = random.nextInt(10);
            phoneNumberBuilder.append(digit);
        }

        // Convert StringBuilder to String and return
        return phoneNumberBuilder.toString();
    }
    @Test
    private void testDataGenerator(){
        System.out.println(emailAddress());
    }

}
