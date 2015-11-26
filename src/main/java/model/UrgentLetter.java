package model;

public class UrgentLetter extends Letter<NotUrgentLetter>
{
	public UrgentLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
		this.cost = content.getCost() * 2;
	}

	@Override
	public void doAction() {

	}

	@Override
	public void displaySend(){

		System.out.println("-> " + this.getSender().getName() + " mails " + this.displayInside()
				+ this.getContent().displayInside() + " to " + this.getReceiver().getName() + " for a cost of " + this.getCost() + " euros");

		this.getSender().getBankAccount().debit(this.getCost());

		System.out.println(" - " + this.getCost() + " euros are debited from " + this.getSender().getName() + " account whose balance is now "
				+ this.getSender().getBankAccount().getAmount() + " euros");
	}

	@Override
	public String displayInside() {
		return "a urgent letter whose is ";
	}
}

