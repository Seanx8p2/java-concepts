package GameStuff;

/**
 * Created by seanwhitfield on 6/7/17.
 */
public class Player
{
	//if a field name is changed, you must also make the change for the object as well.
	//It's also easy to forget to initialize the variables
	public String fullName;
	public int health;
	public String weapon;

	public void loseHealth(int damage)
	{
		this.health = this.health - damage;
		if(this.health <= 0)
		{
			System.out.println("GameStuff.Player has died");
			//reduce the number of lives
		}

	}

	public int healthRemaining()
	{
		return this.health;
	}

}
