package InterviewQuestions.VendingMachine.State;

import java.util.List;

import InterviewQuestions.VendingMachine.ItemType;
import InterviewQuestions.VendingMachine.Note;
import InterviewQuestions.VendingMachine.Product;
import InterviewQuestions.VendingMachine.VendingMachine;

public interface State {
	
	public void clickOnInsertButton(VendingMachine machine);
	
	public void clickOnSelectButton(VendingMachine machine);
	
	public void insertCoins(VendingMachine machine, Note note);
	
	public void selectItem(VendingMachine machine,ItemType type);
	
	public Product dispenseItem(VendingMachine machine);
	
	public List<Note> refund(VendingMachine machine);
	
	public void getChange(double price);
}
