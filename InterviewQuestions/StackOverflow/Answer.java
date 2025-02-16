package InterviewQuestions.StackOverflow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Answer implements Votable, Commentable {
	
	int id;
	String content;
	int authorID;
	int votes;
	LocalDateTime createdAt;
	int questionID;
	boolean isAccepted;
	List<Comment> comments;
	Set<Integer> voteUsers;
	
	Answer(String content, int authorID, int questionID){
		this.id = Service.generateId();
		this.content = content;
		this.authorID = authorID;
		this.votes = 0;
		this.questionID = questionID;
		this.isAccepted = false;
		this.createdAt = LocalDateTime.now();
		this.comments = new ArrayList<>();
		this.voteUsers = new HashSet<>();
	}
	
	public void accepet() {
		this.isAccepted = true;
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
	public String getContent() {
		return content;
	}

	public int getAuthorId() {
		return authorID;
	}
	
	public int getQuestionId() {
		return questionID;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String getTitle() {
		return content;
	}
	
	public boolean isAccepted() {
		return isAccepted;
	}

	@Override
	public String toString() {
		return "Answer [content=" + content + ", authorID=" + authorID + ", questionID=" + questionID + ", comments="
				+ comments + "]";
	}
	
	

}
