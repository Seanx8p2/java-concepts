package com.sean;

import com.sean.Weedz.OGKush;
import com.sean.Weedz.PurpleHaze;
import com.sean.Weedz.Shwag;
import com.sean.Weedz.Weed;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E777946 on 6/3/2017.
 */
public class WeedFactory
{
    public String CompanyName;
    public List Inventory = new ArrayList<Weed>();
    public Accounting Accountant = new Accounting();

    public WeedFactory(String companyName)
    {
        this.CompanyName = companyName;

        Inventory.add(new PurpleHaze());
        Inventory.add(new Shwag());
        Inventory.add((new OGKush()));
    }

    public void Sale(Weed strain, double poundz)
    {
        System.out.println();
        System.out.println("Thanks for buying some " + strain.Strain);

        double revenue = Accountant.CalculateWeedPrice(strain.PricePerPound, poundz);

        System.out.println("That's gonna cost $" + revenue + " kush dollars.");
        System.out.println();

        Accountant.LaunderMoniez(revenue);

    }

    public void PrintCompanyInfo()
    {
        System.out.println("=================================");
        System.out.println(" " + CompanyName + "  Moniez = $" + Accountant.Moniez);
        System.out.println("=================================");
    }

    public void PrintInventory()
    {
        System.out.println("=================================================================================");
        System.out.println(" Press number to order kush.");
        for(int i=0; i<Inventory.size(); i++)
        {
            Weed weed = (Weed)Inventory.get(i);
            System.out.println(" (" + i + ") Strain: " + weed.Strain + ". Price: $" + weed.PricePerPound + "/lb.  Highness = " +weed.HowMuchHigh + " highz. " );
        }
        System.out.println("=================================================================================");
    }
}
//this