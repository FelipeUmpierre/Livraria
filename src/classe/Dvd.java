package classe;

public class Dvd extends Item
{
    public Dvd( String title, int year )
    {
    	this.setTitle( title );
    	this.setYear( year );
    }
    
    @Override
    public String toString()
    {
    	return "\nDvd: \n" + 
    			"\tT�tulo: " + this.getTitle() + "\n" +
    			"\tAno: " + this.getYear()
    			;
    }
}
