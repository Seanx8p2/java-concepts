/**
 * Created by seanwhitfield on 6/5/17.
 */
public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
	{
		//Super: to call the constructor that it is inheriting from
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.coat = coat;
		this.tail = teeth;
		this.teeth = teeth;


	}

}