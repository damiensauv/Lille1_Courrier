package model;

public class UrgentLetter extends Letter
{
	public UrgentLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
	}

	@Override
	public void doAction() {

	}

	@Override
	public void displaySend(){
	}

	public NotUrgentLetter getContent(){
		return (NotUrgentLetter) this.content;
	}

}

