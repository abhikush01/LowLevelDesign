package InterviewQuestions.StackOverflow;

import java.util.Arrays;
import java.util.List;

public class StackOverflowDemo {

	public static void main(String[] args) {
		StackOverflow system = new StackOverflow();

        // Create users
        User alice = system.addUser("Alice", "alice@example.com");
        User bob = system.addUser("Bob", "bob@example.com");
        User charlie = system.addUser("Charlie", "charlie@example.com");

        // Alice asks a question
        Question javaQuestion = system.addQuestion(alice.getId(), "What is polymorphism in Java?",
                "Can someone explain polymorphism in Java with an example?",
                Arrays.asList("java", "oop"));

        // Bob answers Alice's question
        Answer bobAnswer = system.addAnswer(
                "Polymorphism in Java is the ability of an object to take on many forms...", bob.getId(), javaQuestion.getId());

        // Charlie comments on the question
        system.addComment(charlie.getId(), javaQuestion, "Great question! I'm also interested in learning about this.");

        // Alice comments on Bob's answer
        system.addComment(alice.getId(), bobAnswer, "Thanks for the explanation! Could you provide a code example?");

        // Charlie votes on the question and answer
        system.upVote(charlie.getId(), javaQuestion);  // Upvote
        system.upVote(charlie.getId(), bobAnswer);  // Upvote

        // Alice accepts Bob's answer
        system.accept(bobAnswer.getId());

        // Bob asks another question
        Question pythonQuestion = system.addQuestion(bob.getId(), "How to use list comprehensions in Python?",
                "I'm new to Python and I've heard about list comprehensions. Can someone explain how to use them?",
                Arrays.asList("python", "list-comprehension"));

        // Alice answers Bob's question
        Answer aliceAnswer = system.addAnswer(
                "List comprehensions in Python provide a concise way to create lists...", alice.getId(), pythonQuestion.getId());

        // Charlie votes on Bob's question and Alice's answer
        system.upVote(charlie.getId(), pythonQuestion);  // Upvote
        system.upVote(charlie.getId(), aliceAnswer);  // Upvote

        // Print out the current state
        System.out.println("Question: " + javaQuestion.getTitle());
        System.out.println("Asked by: " + system.getUser(javaQuestion.getAuthorId()).getName());
        System.out.println("Tags: " + javaQuestion.getTags().stream().reduce((a, b) -> a + ", " + b).orElse(""));
        System.out.println("Votes: " + javaQuestion.getVotes());
        System.out.println("Comments: " + javaQuestion.getComments().size());
        System.out.println("\nAnswer by " + system.getUser(bobAnswer.getAuthorId()).getName() + ":");
        System.out.println(bobAnswer.getContent());
        System.out.println("Votes: " + bobAnswer.getVotes());
        System.out.println("Accepted: " + bobAnswer.isAccepted());
        System.out.println("Comments: " + bobAnswer.getComments().size());

        System.out.println("\nUser Reputations:");
        System.out.println("Alice: " + alice.getReputation());
        System.out.println("Bob: " + bob.getReputation());
        System.out.println("Charlie: " + charlie.getReputation());

        // Demonstrate search functionality
        System.out.println("\nSearch Results for 'oop':");
        List<Question> searchResults = system.questionByQuery("oop");
        for (Question q : searchResults) {
            System.out.println(q.getTitle());
        }

        System.out.println("\nSearch Results for 'python':");
        searchResults = system.questionByQuery("python");
        for (Question q : searchResults) {
            System.out.println(q.getTitle());
        }

        // Demonstrate getting questions by user
        System.out.println("\nBob's Questions:");
        List<Question> bobQuestions = system.questionByUser(bob.getId());
        for (Question q : bobQuestions) {
            System.out.println(q.getTitle());
        }

	}

}
