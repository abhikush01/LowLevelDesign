package InterviewQuestions.VendingMachine;

import InterviewQuestions.VendingMachine.State.IdleState;

public class VendingMachineDemo {
	
	public static void main(String[] args) {
		
		ProductShelf cokeShelf = new ProductShelf(10, ItemType.COKE, 20);
		ProductShelf pepsiShelf = new ProductShelf(10, ItemType.PEPSI, 50);
		ProductShelf waterShelf = new ProductShelf(10, ItemType.WATER, 15);
		
		Inventory inventory = new Inventory();
		
		inventory.addShelf(ItemType.COKE, cokeShelf);
		inventory.addShelf(ItemType.PEPSI, pepsiShelf);
		inventory.addShelf(ItemType.WATER, waterShelf);
		
		VendingMachine machine = new VendingMachine(inventory);
		
		machine.setState(new IdleState(machine));
		machine.getState().clickOnInsertButton(machine);
		
		machine.getState().insertCoins(machine, Note.TWENTY);
		machine.getState().insertCoins(machine, Note.TWENTY);
		machine.getState().insertCoins(machine, Note.TEN);
		
		machine.getState().clickOnSelectButton(machine);
		
		machine.getState().selectItem(machine, ItemType.WATER);
		
		machine.getState().dispenseItem(machine);
		
		
	}
}
