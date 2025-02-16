package InterviewQuestions.StackOverflow;

import java.util.concurrent.atomic.AtomicInteger;

public class Service {
	
	private static final AtomicInteger counter = new AtomicInteger(0);

    public static int generateId() {
        long nanos = System.nanoTime(); // Higher precision
        return (int) ((nanos % Integer.MAX_VALUE) + counter.getAndIncrement());
    }
}
