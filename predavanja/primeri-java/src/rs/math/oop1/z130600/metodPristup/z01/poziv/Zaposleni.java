package rs.math.oop1.z130600.metodPristup.z01.poziv;

public class Zaposleni
{
	private String ime;
	private double plata;
	
	public Zaposleni(String n, double s )
	{
		ime = n;
		plata = s;
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public double getPlata()
	{
		return plata;
	}
	
	public void povecajPlatu( double zaProcenat )
	{
		double iznosPovisice = plata * zaProcenat / 100;
		plata += iznosPovisice;
	}
	
	@Override
	public String toString()
	{
		return ime + " " + plata;
	}
}
