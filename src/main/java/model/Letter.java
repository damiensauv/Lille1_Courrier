package model;

public abstract class Letter<T>
{
	public Inhabitant sender;
	public Inhabitant receiver;
	public int cost;
	public City city;
	public T content;

	public Letter(){
		super();
	}

	public void letter(Inhabitant sender, Inhabitant receiver, int cost) {
		// TODO implement me	
	}

}

