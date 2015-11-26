package model;


public class RegisteredLetter extends NotUrgentLetter<NotUrgentLetter>
{
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
		this.cost = content.getCost() + 15;
	}

	@Override
	public void doAction()
	{
		this.getContent().doAction();
		String receipt = "Aknoledgment of recepipt for a registered letter whose content is a " + this.getContent().getType() + " whose content is : " + this.getContent();
		AcknowledgeOfReceipt acknowReceipt = new AcknowledgeOfReceipt(this.getReceiver(), this.getSender(), receipt);
		try {
			this.sender.getCity().getPostBox().post(acknowReceipt);
		} catch (CannotAffordLetterException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void displaySend(){
		System.out.println("-> " + this.getSender().getName() + " mails " + this.displayInside()
				+  " to " + this.getReceiver().getName() + " for a cost of " + this.getCost() + " euros");

		System.out.println(" - " + this.getCost() + " euros are debited from " + this.getSender().getName() + " account whose balance is now "
				+ this.getSender().getBankAccount().getAmount() + " euros");

	}

	@Override
	public String displayInside() {
		return "a registered letter whose content is " + this.getContent().displayInside();
	}

}

