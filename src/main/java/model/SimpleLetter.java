package model;


public class SimpleLetter extends NotUrgentLetter
{
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content){
		super(sender, receiver);
		this.cost = 1;
		this.content = content;
	}

	@Override
	public String getContent(){
		return (String)this.content;
	}
}