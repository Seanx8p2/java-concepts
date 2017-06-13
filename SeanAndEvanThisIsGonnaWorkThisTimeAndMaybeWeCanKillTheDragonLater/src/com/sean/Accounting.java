package com.sean;

/**
 * Created by E777946 on 6/3/2017.
 */
public class Accounting
{
    // Monie we got stashed
    public double Moniez = 0;

    public double taxRate = .0420;

    // Add some moniez to de stashe
    public void LaunderMoniez(double newMoniez)
    {
        Moniez += newMoniez;
    }

    public double CalculateWeedPrice(double pricePerPound, double poundz)
    {
        // Sean, please help us. Our accounting system is broke and we're losing $420 kush dollars every
        // time we make a sale. You need to find the cost of the weedz and add tax to it.

        // Hint, Tax Rate is called TaxRate

        return (pricePerPound* poundz* taxRate) + (pricePerPound* poundz);    // Dis right?
    }
}

