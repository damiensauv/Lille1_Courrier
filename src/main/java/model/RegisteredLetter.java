package model;


public class RegisteredLetter extends NotUrgentLetter
{
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
		this.cost = content.getCost() + 15;
	}

	@Override
	public void doAction() {

	}

	@Override
	public NotUrgentLetter getContent(){
		return (NotUrgentLetter) this.content;
	}

}

