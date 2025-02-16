package InterviewQuestions.StackOverflow;

import java.time.LocalDateTime;

public class Comment {
	
	int id;
	String content;
	int authorID;
	LocalDateTime createdAt;
	
	Comment(String content, int authorID){
		this.content = content;
		this.authorID = authorID;
		this.id = Service.generateId();
		this.createdAt = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	public int getAuthorID() {
		return authorID;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "Comment [content=" + content + ", authorID=" + authorID + "]";
	}
	
	
	
}
