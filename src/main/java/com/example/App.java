package com.example;

import com.example.model.Contact;
import com.example.model.EmailAddress;
import com.example.model.PhoneNumber;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<Contact> contacts = Arrays.asList(
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                        Arrays.asList(
                                new PhoneNumber("240-133-0011", "Home"),
                                new PhoneNumber("240-112-0123", "Mobile")
                        ),
                        Arrays.asList(
                                new EmailAddress("dave.sang@gmail.com", "Home"),
                                new EmailAddress("dsanger@argos.com", "Work")
                        )
                ),
                new Contact("Carlos", "Jimenez", "Zappos", "Director",
                        Arrays.asList(),
                        Arrays.asList()
                ),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                        Arrays.asList(
                                new PhoneNumber("412-116-9988", "Work")
                        ),
                        Arrays.asList(
                                new EmailAddress("ali@bmi.com", "Work")
                        )
                )
        );

        // Sort contacts list by last names in ascending order
         contacts.sort(Comparator.comparing(Contact::getLastName));

        // Print contact data in JSON format
        Gson gson = new Gson();
        contacts.forEach(contact -> System.out.println(gson.toJson(contact)));
    }
}
