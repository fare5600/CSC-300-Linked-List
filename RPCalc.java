import java.util.Scanner;
public class RPCalc
{
private Stack theStack;
public RPCalc()
{
this.theStack = new Stack();
}
private boolean isNumber(String s)
{
	String map = "0123456789";
	if(s.charAt(0) == '+' || s.charAt(0) =='-')
	{
		s = s.substring(1);
	}
try
{
Integer.parseInt(s);
}
catch(Exception e)
{
return false;
}
return true;
}
private boolean isOperator(String s)
{
String map = "+-*/";
return map.indexOf(s) != -1 && s.length() == 1;
}
public void on() throws Exception
{
Scanner input = new Scanner(System.in);
while(true)
{
System.out.print("=> ");
String val = input.nextLine().trim();
if(val.equalsIgnoreCase("quit"))
{
break;
}
else if(val.equalsIgnoreCase("show"))
{
if(this.theStack.isEmpty())
{
System.out.println("Empty Stack");
continue;
}
Stack temp = new Stack();
while(!this.theStack.isEmpty())
{
temp.push(this.theStack.pop());
}
while(!temp.isEmpty())
{
int num = temp.pop();
System.out.println(num);
this.theStack.push(num);
}
}
else if(this.isNumber(val))
{
this.theStack.push(Integer.parseInt(val));
}
else if(this.isOperator(val))
{
int num1 = this.theStack.pop();
int num2 = this.theStack.pop();
if(val.equals("+"))
{
this.theStack.push(num1 + num2);
}
else if(val.equals("-"))
{
this.theStack.push(num1 - num2);
}
else if(val.equals("*"))
{
this.theStack.push(num1 * num2);
}
else if(val.equals("/"))
{
this.theStack.push(num1 / num2);
}
}
else
{
System.out.println("Illegal Input");
}
}
}
}