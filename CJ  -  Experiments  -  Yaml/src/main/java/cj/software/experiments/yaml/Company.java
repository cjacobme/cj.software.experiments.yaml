package cj.software.experiments.yaml;

public class Company
		extends Person
{
	private static final long serialVersionUID = 1L;

	private int foundedYear;

	public int getFoundedYear()
	{
		return this.foundedYear;
	}

	public void setFoundedYear(int foundedYear)
	{
		this.foundedYear = foundedYear;
	}

}
