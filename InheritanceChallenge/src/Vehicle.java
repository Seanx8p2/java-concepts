/**
 * Created by seanwhitfield on 6/5/17.
 */
public class Vehicle
{
	//private variables

	private String name;
	private String size;

	private int currentVelocity;
	private int currentDirection;


	//contructor
	public Vehicle(String name, String size)
	{
		this.name = name;
		this.size = size;

		this.currentDirection = 0;
		this.currentVelocity = 0;

	}

	//Methods
	public void move(int velocity, int direction)
	{
		currentDirection = direction;
		currentVelocity = velocity;
		System.out.println("vehicle.move(): Moving at )" + currentVelocity + " in direction" + currentDirection);

 	}

	public void steering(int direction)
	{
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees");
	}

	public void stop()
	{
		this.currentVelocity = 0;
	}

	//Getter


	public String getName()
	{
		return name;
	}

	public String getSize()
	{
		return size;
	}

	public int getCurrentVelocity()
	{
		return currentVelocity;
	}

	public int getCurrentDirection()
	{
		return currentDirection;
	}
}
