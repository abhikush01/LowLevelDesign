package InterviewQuestions.StackOverflow;

public enum Reputation {
	QUESTION(10),
	ANSWER(20),
	COMMENT(5);
	
	private final int value;

	Reputation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
