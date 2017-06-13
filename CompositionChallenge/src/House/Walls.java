package House;

import java.awt.*;

/**
 * Created by seanwhitfield on 6/6/17.
 */
public class Walls
{

	private String meterial;
	private Dimension dimension;


	public Walls(String meterial, Dimension dimension)
	{
		this.meterial = meterial;
		this.dimension = dimension;
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
