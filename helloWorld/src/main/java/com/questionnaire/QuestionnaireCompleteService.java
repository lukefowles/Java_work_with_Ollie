package com.questionnaire;

import com.email.EmailValidator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QuestionnaireCompleteService {
    public int addQuestion(Questionnaire questionnaire, Question question) {
        Question[] questionList = questionnaire.getListOfQuestions();
        questionList[questionnaire.getCount()] = question;
        int count = questionnaire.getCount();
        questionnaire.setCount(++count);
        return 1;
    }

    public void conductQuestionnaire(Questionnaire questionnaire) throws IOException {
        Scanner scanner = new Scanner(System.in);

        EmailValidator validation = new EmailValidator();

        //Asks respondent for name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        //Asks respondent for email
        System.out.println("What is your email");
        String email = scanner.nextLine();

        while (!validation.isValid(email)) {
            System.out.println("Please re enter a valid email address");
            email = scanner.nextLine();
        }

        //Add new person to questionnaire respondents
        Person2 person = new Person2(name, email);

        String fileAddress = "/home/luke.fowles/BNTA/JAVA_with_Ollie/java_work/helloWorld/src/" + person.toString()
                             + ".txt";

        File file = new File(fileAddress);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        //Ask questions, looping through for each question

        for(Question question: questionnaire.getListOfQuestions())
        {
            if (question != null) {
                System.out.println(question.getQuestion());
                String answer = scanner.nextLine();
                printWriter.println(question.getQuestion() + ": " + answer);
            }
        }

        printWriter.flush();
        printWriter.close();
    }

}
