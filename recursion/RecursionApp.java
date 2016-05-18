package recursion;

import edu.princeton.cs.introcs.StdDraw;

public class RecursionApp {
	
	public static void recursion(int n, double x, double y, double size)
	{
		if(n == 0)return;
		double x0 = x - size/2;
		double x1 = x + size/2;
		double y0 = y - size/2;
		double y1 = y + size/2;
		
		StdDraw.line(x0,y0,x0,y1);//vertical line segment
		StdDraw.line(x0, y0, x1, y0);//horizontal line segment
		StdDraw.line(x0, y0, x1, y1);//diagonal line segment 
		
		recursion(n-1,x0,y0,size/2);//lower left Square segment of draw
		recursion(n-1,x0,y1,size/2);//top left of the Square segment drawn
		recursion(n-1,x1,y0,size/2);//lower right Square segment of drawn
		recursion(n-1,x1,y1,size/2);//top right Square segment
	}
	
	public static void squaredraw(int n, double x, double y, double size)
	{
		if(n == 0)return;
		double x0 = x - size/4;
		double x1 = x + size/2;
		double y0 = y - size/4;
		double y1 = y + size/2;
		
		StdDraw.line(x0, y0, x0, y1);//vertical line segment
		StdDraw.line(x0, y0, x1, y0);//Horizontal bottom line segment
		StdDraw.line(x1, y0,x1,y1);// Vertical right line segment
		StdDraw.line(x0, y1, x1, y1);//top horizontal line segment
		
		squaredraw(n-1,x0,y0,size/2);//lower left Square segment of draw
//		squaredraw(n-1,x0,y1,size/2);//top left of the Square segment drawn
//		squaredraw(n-1,x1,y0,size/2);//lower right Square segment of drawn
//		squaredraw(n-1,x1,y1,size/2);//top right Square segment
		
		
		
	}
	
	
	public static void main(String [] args)
	{
		//recursion(5, .5, .5, .5);
		squaredraw(6,.5,.5,.5);
	}
}
