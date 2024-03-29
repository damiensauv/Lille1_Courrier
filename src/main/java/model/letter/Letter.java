package model.letter;

import model.Inhabitant;

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

	/**
	 * Do Action of Letter
	 */
	public abstract void doAction();

	/**
	 * Display the message
	 */
	public void displayMessage() {
		System.out.println("<- " + this.getReceiver().getName() + " receives " + this.contentInside() + " from "+ this.getSender().getName());
	}

	/**
	 * @return the content inside the letter
     */
	public abstract String contentInside();

	/**
	 *
	 * @return sender
     */
	public Inhabitant getSender() {
		return sender;
	}

	/**
	 *
	 * @param sender
     */
	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	/**
	 *
	 * @return receiver
     */
	public Inhabitant getReceiver() {
		return receiver;
	}

	/**
	 *
	 * @param receiver
     */
	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}

	/**
	 *
	 * @return cost
     */
	public int getCost() {
		return cost;
	}

	/**
	 *
	 * @param cost
     */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 *
	 * @return this
     */
	public Letter getType()
	{
		return this;
	}

	/**
	 *
	 * @return content
     */
	public T getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
     */
	public void setContent(T content) {
		this.content = content;
	}
}

