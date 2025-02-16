package InterviewQuestions.StackOverflow;

public interface Votable {
	public void upVote(int userId);
	public void downVote(int userId);
	public int getVotes();
}
