package InterviewQuestions.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	int id;
	String name;
	String email;
	int reputaion;
	List<Question> questions;
	List<Answer> answers;
	List<Comment> comments;
	
	User(String name, String email){
		this.id = Service.generateId();
		this.name = name;
		this.email = email;
		this.reputaion = 0;
		this.questions = new ArrayList<>();
		this.answers = new ArrayList<>();
		this.comments = new ArrayList<>();
	}
	
	public void addQuestions(Question question) {
		this.questions.add(question);
	}
	
	public void addAnswers(Answer ans) {
		this.answers.add(ans);
	}
	
	public void addComments(Comment comment) {
		this.comments.add(comment);
	}
	
	public int getReputation() {
		return this.reputaion;
	}
	
	public void updateReputation(Reputation type) {
		this.reputaion += type.getValue();
	}
	
	public int getId() {
		return id;
	}
	
	public void notificationForAnswer(User user, Question question){
		System.out.println("Hi "+ this.getName() +" : "+ user.getName()+ " added Answer to the Question " + question.getTitle());
	}
	
	public void notificationForComments(User user, Commentable text){
		System.out.println(user.getName()+ " added Comment to the " + text.getTitle());
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getReputaion() {
		return reputaion;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", questions=" + questions + ", answers="
				+ answers + ", comments=" + comments + "]";
	}
	
	
	
}
