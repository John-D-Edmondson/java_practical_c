package com.qa;

import java.util.*;
import java.util.function.Predicate;

public class LambdaChallenges {

// ToDo A
//        1. Create a list of integers called intList with the values of 1 to 5
//        2. Print intList
//        3. Using the replaceAll method and a lambda function, add one to each value
//        4. Print the modified intList
    public void A(){
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(intList.toString());

        intList.replaceAll(n -> n +1);
        System.out.println(intList.toString());
    }

// ToDo B
//        1. Create a list of Strings called 'colours' with values of "Red", "Yellow", "Pink", "GREEN"
//        2. Print the 'colours' list
//        3. Using the replaceAll method and a lambda function, convert the strings to lowercase
//        4. Print the modified 'colours' list
//        5. Using the replaceAll method and a lambda function, convert the strings to UPPERCASE
//        6. Print the modified 'colours' list
        public void B(){
            List<String> colours = Arrays.asList("Red", "Yellow", "Pink", "GREEN");
            System.out.println(colours.toString());
            colours.replaceAll(n -> n.toLowerCase());
            System.out.println(colours.toString());
            colours.replaceAll(n -> n.toUpperCase());
            System.out.println(colours.toString());
        }
// ToDo C
//        1. Create a Functional Interface called 'Addable'
//        2. Define a single method 'add' within the interface that accepts two ints and returns an int
//        3. Create a variable of the interface type called 'addCalculator' and assign a lambda expression
//        to add 2 parameters, x and y
//        4. Invoke the 'add' method passing in any ints to test the addable functionality
//        5. Print your results to the console

    public interface Addable {
        int add(int a, int b);
    }

    public void C(){
        Addable addCalculator = (a, b) -> a + b;
        System.out.println(addCalculator.add(8,7));
    }

//  ToDo D
//        1. Create an Optional<String> called helloOptional with the value of
//        'Hello and welcome to Challenge 4'
//        2. Create a variable of type Predicate<String> called 'welcomePredicate' and assign it a
//        lambda expression to test whether 'welcome' appears in the String
//        3. Invoke the 'filter' method of helloOptional passing in the predicate object and
//        assign the result to an optional string called 'welcomeOptional'
//        4. Print your welcomeOptional to the console
//        5. Repeat the above steps and create a variable of type Predicate<String> called 'heyPredicate'
//        and assign it a lambda expression to test whether 'hey' appears in the String
//        6. Invoke the 'filter' method of helloOptional passing in the new predicate object and
//        assign the result to an optional string called 'heyOptional'
//        7. Print your heyOptional to the console

    public void D(){
        Optional<String> helloOptional = Optional.of("Hello and welcome to Challenge 4");
        Predicate<String> welcomePredicate = n -> n.contains("welcome");
        Optional<String> welcomeOptional =  helloOptional.filter(welcomePredicate);
        System.out.println(welcomeOptional);
        Predicate<String> heyPredicate = n-> n.contains("hey");
        Optional<String> heyOptional = helloOptional.filter(heyPredicate);
        System.out.println(heyOptional);

    }
}
