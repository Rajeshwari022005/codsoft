import java.util.*;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOption; 

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    public boolean isCorrect(int userOption) {
        return userOption == correctOption + 1; 1
    }
}

public class QuizApp {
    private List<Question> questions;
    private int score;
    private int correctAnswers;
    private int incorrectAnswers;
    private Scanner scanner;

    public QuizApp() {
        questions = new ArrayList<>();
        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;
        scanner = new Scanner(System.in);
        loadQuestions();
    }

    private void loadQuestions() {
        
        questions.add(new Question(
            "What is the capital of France?",
            Arrays.asList("Berlin", "Madrid", "Paris", "Rome"),
            2 
        ));

        questions.add(new Question(
            "Which planet is known as the Red Planet?",
            Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"),
            1 
        ));

        questions.add(new Question(
            "What is the largest mammal?",
            Arrays.asList("Elephant", "Blue Whale", "Giraffe", "Rhino"),
            1 
    ));
    }

    public void startQuiz() {
        System.out.println("=== Welcome to the Quiz ===");
        for (Question question : questions) {
            askQuestion(question);
        }
        showResult();
    }

    private void askQuestion(Question question) {
        question.display();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("\nTime's up! Moving to next question...");
                incorrectAnswers++;
                timer.cancel();
            }
        };
        timer.schedule(task, 10000); 

        System.out.print("Enter your answer (1-4): ");
        int userAnswer = -1;

        try {
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                timer.cancel(); 
                if (question.isCorrect(userAnswer)) {
                    System.out.println("Correct!");
                    score += 10;
                    correctAnswers++;
                } else {
                    System.out.println("Wrong Answer!");
                    incorrectAnswers++;
                }
            } else {
                scanner.next(); 
                timer.cancel();
                System.out.println("Invalid input. Moving to next question...");
                incorrectAnswers++;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            timer.cancel();
        }
        System.out.println();
    }

    private void showResult() {
        System.out.println("=== Quiz Completed ===");
        System.out.println("Your Score: " + score);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + incorrectAnswers);
    }

    public static void main(String[] args) {
        QuizApp quiz = new QuizApp();
        quiz.startQuiz();
    }
}
