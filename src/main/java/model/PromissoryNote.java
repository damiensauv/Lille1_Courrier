package model;


public class PromissoryNote extends NotUrgentLetter
{
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, double content){
		super(sender, receiver);
		double tmp = content * 0.01;
		this.cost = 1 + (int)tmp;
		this.content = content;
	}

	@Override
	public void doAction()
	{
		if (this.getReceiver().getBankAccount().getAmount() >= this.getCost())
			{
				String thanksText = this.getReceiver().getName() + " mails a thanks letter whici is a simple letter whose content is a text content (thanks for a Promissory note letter whose content is a money content of " + this.content + ") to "
				+ this.getReceiver().getName() + " for a cost of " + this.getCost() + " euro";
				SimpleLetter thankYouLetter = new SimpleLetter(this.getReceiver(), this.getSender(), thanksText);
				this.getSender().getCity().getPostBox().add(thankYouLetter);
			}
		else
			System.out.println(this.getReceiver().getName() + " cannot send a thankyou letter. This amount of money on his BankAccount is not sufficient");
	}

	@Override
	public Integer getContent(){
		return (Integer) this.content;
	}
}

