package model;

public abstract class Letter<T>
{
	public Inhabitant sender;
	public Inhabitant receiver;
	public int cost;
	public T content;

	public Letter(Inhabitant sender, Inhabitant receiver){
		super();
		this.sender = sender;
		this.receiver = receiver;
	}

	protected Letter() {
	}

	public Inhabitant getSender() {
		return sender;
	}

	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}

