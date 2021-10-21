package com.olivertech;
import com.email.EmailValidator;
import com.questionnaire.Person2;
import com.questionnaire.Question;
import com.questionnaire.Questionnaire;
import com.questionnaire.QuestionnaireCompleteService;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: Come back to me
        String name = "Oliver";
        // String name = new String ("Oliver")

        int age = 23;
        long age2 = 20L;

        double pi = 3.14;
        float pi2 = 3.14f;

        char letter = 'A';
//        System.out.println("hello !");
//        System.out.println("hello !");
//        System.out.println(10 % 2 != 1);
//
//        int[] numbers = {1, 2, 3};
//
//        for(int i=0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//
//        for(int number : numbers ){
//            System.out.println(number);
//        }

        // Arrays.steam(numbers).forEach(n -> System.out.println(n));

//        if(1 > 2){
//            System.out.println("true");
//        } else if(1==0){
//
//        } else {
//
//        }
//
//        String gender = "Female";
//
//        if(gender.equals("Female")){
//            System.out.println("do something");
//        } else if(gender.equals("Female")){
//            System.out.println("bye");
//        }else {
//
//        }
//        switch(gender){
//            case "Female":
//                System.out.println("do something");
//                break;
//            case "Male":
//                System.out.println("bye");
//                break;
//            default:
//                System.out.println("unknown");
//                System.out.println("unknown");
//        }

//        Scanner scanner = new Scanner(System.in)
//        System.out.println("What is your name?")
//        String input = scanner.nextLine();
//        System.out.printf("Hello " + input);

//        String[] array = {"you", "are", "how", "Hello"};
//
//        for(int i = array.length-1; i >= 0; i--){
//            System.out.println(array[i]);
//        }

//        System.out.println(sum);


        Passport british = new Passport(123431, "Oliver", "Red");
        british.setPassportNumber(1);
        System.out.println(british.getPassportNumber());
        Person olivia = new Person("Olivia", "Ekwalla", "Female");
        Person luka = new Person("Luke", "Luke", "Male");
        System.out.println(luka.getFirstName());


        // Car ford = new Car("ford". "mustang", 20,000)
//        Car[] mycars = {new Car("ford", "mustang", 20000),
//                new Car("ferrari", "458 Italia", 100000)
//        };
//
//        Garage cambridgeGarage = new Garage("Huge", mycars, "light Blue", true);
//        System.out.println(cambridgeGarage.getSize());
//        System.out.println(Arrays.toString(cambridgeGarage.getCars()));

        Question question1 = new Question("What is for dinner?");
        Question question2 = new Question("You got any going for me pal?");
        Questionnaire exampleQuestionnaire = new Questionnaire(0, 50);
        QuestionnaireCompleteService example = new QuestionnaireCompleteService();
        example.addQuestion(exampleQuestionnaire, question1);
        example.addQuestion(exampleQuestionnaire, question2);

        example.conductQuestionnaire(exampleQuestionnaire);


    }

//    static void completeQuestionnaire() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        File file = new File("/home/luke.fowles/BNTA/JAVA_with_Ollie/java_work/helloWorld/src/answer.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//        EmailValidator validation = new EmailValidator();
//
//        FileWriter fileWriter = new FileWriter(file);
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//
//        // what is your name ?
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//
//        // what is your email
//        System.out.println("What is your email");
//        String email = scanner.nextLine();
//
//        while (!validation.isValid(email)) {
//            System.out.println("Please re enter a valid email address");
//            email = scanner.nextLine();
//        }
//
//        //Add new person to questionnaire respondents
//        Person2 person = new Person2(name, email);
//
//        //Questionnaire questionnaire = new Questionnaire(person, new Question[]{new Question("What's for tea ? "), new Question("Got any leftovers ;)?")});
//
//        //Ask questions, looping through for each question
//
//        for(Question question: questionnaire.getListOfQuestions())
//        {
//            System.out.println(question.getQuestion());
//            String answer = scanner.nextLine();
//            printWriter.println(question.getQuestion() + ": " + answer);
//        }
//
//        printWriter.flush();
//        printWriter.close();
//
//    }
}


