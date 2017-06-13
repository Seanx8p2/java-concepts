package House;

import java.awt.*;

/**
 * Created by seanwhitfield on 6/6/17.
 */
public class Doors
{
	private int numberOfDoors;
	private String meterial;
	private Dimension dimension;


	public Doors(int numberOfDoors, String meterial, Dimension dimension)
	{
		this.numberOfDoors = numberOfDoors;
		this.meterial = meterial;
		this.dimension = dimension;
	}

	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}

	public String getMeterial()
	{
		return meterial;
	}

	public Dimension getDimension()
	{
		return dimension;
	}
}
