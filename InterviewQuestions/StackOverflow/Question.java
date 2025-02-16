package InterviewQuestions.StackOverflow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question implements Votable, Commentable {
	
	int id;
	String title;
	String content;
	int authorID;
	int votes;
	LocalDateTime createdAt;
	List<Answer> answers;
	List<Comment> comments;
	List<String> tags;
	Set<Integer> voteUsers;
	
	Question(String title, String content, int authorID, List<String> tags){
		this.id = Service.generateId();
		this.title = title;
		this.content = content;
		this.authorID = authorID;
		this.votes = 0;
		this.createdAt = LocalDateTime.now();
		this.answers = new ArrayList<>();
		this.comments = new ArrayList<>();
		this.tags = tags;
		this.voteUsers = new HashSet<>();
	}
	
	public void addAnswer(Answer answer) {
		this.answers.add(answer);
	}

	@Override
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

	@Override
	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public void upVote(int userId) {
		if(!voteUsers.contains(userId)) {
			this.voteUsers.add(userId);
			this.votes++;
		}
	}
	
	@Override
	public void downVote(int userId) {
		if(voteUsers.contains(userId)) {
			this.voteUsers.remove(userId);
			this.votes--;
		}
	}

	@Override
	public int getVotes() {
		return this.votes;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getAuthorId() {
		return authorID;
	}

	@Override
	public String toString() {
		return "Question [title=" + title + ", content=" + content + ", authorID=" + authorID + ", answers=" + answers
				+ ", comments=" + comments + ", tags=" + tags + "]";
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	

}
