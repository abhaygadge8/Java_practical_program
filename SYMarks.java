package SY
public class SYMarks
{
	public int ComputerTotal;
	public int Mathstotal;
	public int ElectronicsTotal;
	SYMarks()
	{
		this.ComputerTotal=0;
		this.Mathstotal=0;
		this.ElectonicsTotal=0;
	}

	SYMarks(int computer,int math,int electonics)
	{
		this.ComputerTotal=computer;
		this.Mathstotal=math;
		this.ElectonicsTotal=electronics;
	}
}