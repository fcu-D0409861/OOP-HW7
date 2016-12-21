package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	
	final String name;	//name��type���� �@���Q��l�ƴN����ק�
	final private PokemonType type;
	int cp;
	Pokemon(String name,PokemonType type,int cp)
	{
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	
	public String getname()
	{
		return name;
	}
	public PokemonType gettype()
	{
		return type;
	}
	public int getcp()
	{
		return cp;
	}
	public void setcp(int cp)
	{
		this.cp=cp;
	}
	public abstract void attack();
}
