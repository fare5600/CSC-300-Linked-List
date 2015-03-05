
public class Driver
{
public static void main(String[] elephant) throws Exception
{
//RPCalc theCalc = new RPCalc();
//theCalc.on();
	Driver.displayType("123");
	Driver.displayType("3.14159");
	
}

static void displayType(String s)
{
	if(s.indexOf('.') != -1)
	{
		System.out.println("Double");
	}
	else
	{
		System.out.println("Int");
	}
}
}