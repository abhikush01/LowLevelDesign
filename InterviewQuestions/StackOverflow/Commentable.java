package InterviewQuestions.StackOverflow;

import java.util.List;

public interface Commentable {
	public void addComment(Comment comment);
	public List<Comment> getComments();
	public String getTitle();
	public int getAuthorId();
}
