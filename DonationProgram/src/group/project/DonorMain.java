/*
 * By using this program you agree to hold the authors harmless
 * from any damages incurred.
 */
package group.project;

import java.util.ArrayList;

/**
 *
 * @author Jedidiah Bird
 */
public class DonorMain
{
    
    private ArrayList<Donor> Donors;

    public DonorMain()
    {
        Donors = new ArrayList<>();
    }
    
    public void addDonor(Donor d)
    {
        Donors.add(d);
    }
    
    public void getDonors()
    {
        for (int i = 0; i < Donors.size(); i++)
        {
            Donor currentDonor = Donors.get(i);
            String[] donorNotes = currentDonor.getNotes();
            System.out.println(currentDonor.getName());
            for (int j = 0; j < donorNotes.length; j++)
            {
                if (donorNotes[j] != null)
                {
                    System.out.println(donorNotes[j]);
                }
            }
        }
    }

    public void getDonor(String n)
    {
        String donorName = new String();
        String name = new String();
        boolean validate = false;
        name = ".*" + n + name.concat(".*");
        name = name.toUpperCase();
        for (int i = 0; i < Donors.size(); i++)
        {
            Donor currentDonor = Donors.get(i);
            donorName = currentDonor.getName();
            if (donorName.matches(name))
            {
                System.out.println(currentDonor.getName());
                validate = true;
            }
        }
        if (validate == false)
        {
            System.out.println("No donor found.  Please check the name.");
        }
        
    }
    
    public void removeDonor(String name)
    {
        
        for (int i = 0; i < Donors.size(); i++)
        {
            Donor currentDonor = Donors.get(i);
            if (currentDonor.getName().equals(name))
            {
                Donors.remove(i);
            }
        }
        
    }
    
}
