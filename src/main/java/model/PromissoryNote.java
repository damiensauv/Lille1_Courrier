package model;


public class PromissoryNote extends NotUrgentLetter<Integer>
{
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, int content){
		super(sender, receiver);
		double tmp = ((double)content) * 0.01;
		this.cost = 1 + (int)tmp;
		this.content = content;
	}

	@Override
	public void doAction()
	{
		if (this.getReceiver().getBankAccount().getAmount() >= this.getCost())
			{


				Letter<?> thankYouLetter = new ThanksLetter(this.getReceiver(), this.getSender(), String.valueOf(this.getContent()));

				try {
					this.getSender().getCity().getPostBox().post(thankYouLetter);
				} catch (CannotAffordLetterException e) {
					System.out.println(e.getMessage());
				}
			}
		else
			System.out.println(this.getReceiver().getName() + " cannot send a thankyou letter. This amount of money on his BankAccount is not sufficient");
	}

	@Override
	public void displaySend(){
		System.out.println("-> " + this.getSender().getName() + " mails " + this.displayInside() + " to " + this.getReceiver().getName() + " for a cost of " + this.getCost() + " euros");

		this.getSender().getBankAccount().debit(this.getCost());

		System.out.println(" - " + this.getCost() + " euros are debited from " + this.getSender().getName() + " account whose balance is now "
				+ this.getSender().getBankAccount().getAmount() + " euros");

	}

	@Override
	public String displayInside() {
		return "a promissory note letter whose content is a money (" + this.getContent() + ")";
	}
}

