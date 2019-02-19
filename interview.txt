package InterviewQuestions;
import java.util.*;
  class Sequential
{
	public double x;
	public double y;
	Sequential(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
   class dist{
	   public double findist(Sequential sq[])
	   {
		  double a,b;
a=Math.sqrt((sq[1].x-sq[0].x)*(sq[1].x-sq[0].x)+(sq[1].y-sq[0].y)*(sq[1].y-sq[0].y ));
b=Math.sqrt((sq[2].x-sq[1].x)*(sq[2].x-sq[1].x)+(sq[2].y-sq[1].y)*(sq[2].y-sq[1].y ));
return a+b;
	   }
	  
  }
public class distances {
	
	public static void main(String args[])
	{
		Sequential sq[]=new Sequential[4];
	sq[0]=new Sequential(6,8);
	sq[1]=new Sequential(3,4);
	sq[2]=new Sequential(6,8);
	dist d=new dist();
	Double z=d.findist(sq);
	System.out.println(z);
	
	}

}
