package House;

/**
 * Created by seanwhitfield on 6/6/17.
 */
public class Dimensions
{
	private int height;
	private int width;
	private int depth;

	public Dimensions(int height, int width, int depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public int getHieght()
	{
		return height;
	}

	public int getWidth()
	{
		return width;
	}

	public int getDepth()
	{
		return depth;
	}
}
