package model.letter;


import model.Inhabitant;

public class SimpleLetter extends NotUrgentLetter<String>
{
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content){
		super(sender, receiver);
		this.cost = 1;
		this.content = content;
	}

	public String contentInside()
	{
		return "a simple letter whose content is a text content " + this.getContent();
	}

	@Override
	public void doAction()
	{

	}
}