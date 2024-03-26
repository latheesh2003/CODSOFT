import java.util.*;
class task2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of subjects: ");
        int n=sc.nextInt();
        int[] subjectmarks=new  int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter the marks obtained in subject "+(i+1)+": ");
            subjectmarks[i]=sc.nextInt();

        }
        int totalmarks=calculatetotalmarks(subjectmarks);
        double averagepercentage=calculateaveragepercentage(totalmarks,n);
        char grade=calculategrade(averagepercentage);
        displayresults(totalmarks,averagepercentage,grade);
    }
        public  static int calculatetotalmarks(int[]subjectmarks)
        {
            int total=0;
            for(int marks:subjectmarks)
            {
                total=total+marks;
            
            }
            return total;
        }
        public static double calculateaveragepercentage(int totalmarks,int numsubjects)
        {
            return (double) totalmarks/numsubjects;
        }
        public static  char calculategrade(double averagepercentage)
        {
            if(averagepercentage>=90)
            {
                return 'A';
            }
            else if(averagepercentage>=80)
            {
                return 'B';
            }
            else if(averagepercentage>=70)
            {
                return 'C';
            }
            else if(averagepercentage>=60)
            {
                return 'D';
            }
        else 
            {
                return 'F';
            }

        }
        public  static void displayresults(int totalmarks,double averagepercentage,char grade)
        {
            System.out.println("totalmarks: "+totalmarks);
            System.out.println("average percentage:"+String.format("%.2f",averagepercentage)+"%");
            System.out.println("grade:"+grade); 


        }
}
