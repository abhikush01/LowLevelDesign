package InterviewQuestions.StackOverflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StackOverflow {
	
	Map<Integer, User> users;
	Map<Integer, Question> questions;
	Map<Integer, Answer> answers;
	
	StackOverflow(){
		this.users = new HashMap<>();
		this.questions = new HashMap<>();
		this.answers = new HashMap<>();
	}
	
	public User getUser(int userId) {
		return users.get(userId);
	}
	
	public User addUser(String name, String email) {
		User user = new User(name, email);
		if(!users.containsKey(user.getId())) {
			users.put(user.getId(), user);
		}
		return user;
	}
	
	public Question addQuestion(int userId, String title, String content, List<String> tags) {
		Question question = new Question(title, content, userId, tags);
		users.get(userId).addQuestions(question);
		users.get(userId).updateReputation(Reputation.QUESTION);
		questions.put(question.getId(), question);
		return question;
	}
	
	public Answer addAnswer(String content, int userId, int questionId) {
		Answer answer = new Answer(content, userId, questionId);
		users.get(userId).addAnswers(answer);
		answers.put(answer.getId(), answer);
		int id = questions.get(questionId).getAuthorId();
		users.get(id).notificationForAnswer(users.get(userId), questions.get(questionId));
		return answer;
	}
	
	public void accept(int answerId) {
		Answer answer = answers.get(answerId);
		User author = users.get(answer.getAuthorId());
		answer.accepet();
		author.updateReputation(Reputation.ANSWER);
	}
	
	public void unAccept(int answerId) {
		Answer answer = answers.get(answerId);
		User author = users.get(answer.getAuthorId());
		author.getAnswers().remove(answer);
		answers.remove(answerId);
	}
	
	public void addComment(int userId, Commentable entity, String content) {
		Comment comment = new Comment(content, userId);
		entity.addComment(comment);
		User author = users.get(entity.getAuthorId());
		author.notificationForComments(users.get(userId), entity);
		
	}
	
	public List<Question> questionByUser(int userId){
		return this.users.get(userId).getQuestions();
	}
	
	public List<Question> questionByQuery(String query){
		List<Question> list = new ArrayList<>();
		
		for(Question question : questions.values()) {
			if(question.getTitle().toLowerCase().contains(query.toLowerCase()) || question.getTags().contains(query)) {
				list.add(question);
			}
		}
		
		return list;
	}
	
	public void upVote(int userId, Votable entity) {
		entity.upVote(userId);
	}
	
	public void downVote(int userId, Votable entity) {
		entity.downVote(userId);
	}
	
}
