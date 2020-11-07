package cj.software.experiments.yaml;

import java.io.Serializable;

public abstract class Person
		implements
		Serializable
{
	private static final long serialVersionUID = 1L;

	private String name;

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
