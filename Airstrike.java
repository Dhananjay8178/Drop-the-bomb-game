import java.io.*; 
import java.util.Scanner;  
public class Airstrike{

     public static void main(String []args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of camps to be inputed that is the size of the arrays");
         int n=sc.nextInt();
         int i,j,k;
        double x[]= new double[n];           // array for x-axis of the camp
        double y[]= new double[n];           // array for y-axis of the camp
        double r[]= new double[n];           // array for radius of the camps
        
        System.out.println("Enter the x-axis of the camps");
        for(i=0;i<n;i++)
        {
            x[i] = sc.nextDouble();                                                  // Accepting the values of x coordinates of all the camps
        }
        System.out.println("Enter the y-axis of the camps");
        for(j=0;j<n;j++)
        {
            y[j] = sc.nextDouble();                                                 // Accepting the values of y coordinates of all the camps
        }
        System.out.println("Enter the radius of the camps");
        for(k=0;k<n;k++)
        {
            r[k] = sc.nextDouble();                                                 // Accepting the values of the radius of all the camps
        }
         System.out.println("Enter the bomb energy radius");
         double bomb_radius=sc.nextDouble();
         
         double distSq=0;
         double sum_x=0;
         double sum_y=0;
         double average_x=0;
         double average_y=0;
         
         for(i=0;i<n;i++)
         {
             sum_x=sum_x+x[i];
         }
         for(j=0;j<n;j++)
         {
             sum_y=sum_y+y[j];
         }
         average_x=sum_x/n;                                                 // For finding out the average x- axis of the array that will be considered as the x-axis of the drop
         average_y=sum_y/n;                                                 // for finding out the average y-axis of the array that will be considered as the y-axis of the drop
         
          System.out.println("The coordinates of the airstrike are" +average_x +average_y);
         
         for(i=0;i<n;i++)                                                                                           
         {
              if ((x[i] - average_x) * (x[i] - average_x) +(y[i] - average_y) * (y[i] - average_y) <= bomb_radius * bomb_radius)            // this logic compares the points of the array with the points of drop that they lie inside the circl or not
              {
                  System.out.println("The camp lies inside the airstrike circle so it is destructed" +i);
              }
              else
              {
                  for(i=0;i<n;i++)
                  {
                   distSq = (double)Math.sqrt((x[i] - average_x) * (x[i] - average_x) +(y[i] - average_y) * (y[i] - average_y));                //// this logic finds out the square root to find the distance of the cicle and then comparing whether the other circle lie inside the circle or not.
                   if (distSq + bomb_radius ==r[i] )
                   {
                       System.out.println("The camp lies inside the airstrike circle so it is destructed" +i);
                   }
                   else if(distSq + bomb_radius< r[i])
                   {
                        System.out.println("The camp lies inside the airstrike circle so it is destructed" +i);
                   }
                  }
	
              }
         }
         
        
        
     }
}
