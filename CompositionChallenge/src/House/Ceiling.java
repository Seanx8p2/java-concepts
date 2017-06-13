package House;

import java.awt.*;

/**
 * Created by seanwhitfield on 6/6/17.
 */
public class Ceiling
{
	private Dimension dimension;
	private String meterial;

	public Ceiling(Dimension dimension, String meterial)
	{
		this.dimension = dimension;
		this.meterial = meterial;
	}


	public Dimension getDimension()
	{
		return dimension;
	}

	public String getMeterial()
	{
		return meterial;
	}
}
