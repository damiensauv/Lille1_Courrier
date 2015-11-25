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
	public void doAction() {
		
	}

	@Override
	public Integer getContent(){
		return (Integer) this.content;
	}
}

