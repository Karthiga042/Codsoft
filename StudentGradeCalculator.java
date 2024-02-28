import java.util.Scanner;
class Total
{
    public int totalMarks(int marks[])
    {
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] <= 100)
            {
                sum+=marks[i];
            }
            else
            {
                System.out.println("Marks should be less than or equal to 100");
            }
        }
        return sum;
    }
}

class Average extends Total
{
    public double averageMarks(int sum,int subject)
    {
        double avg=((double)sum/subject);
        return avg;
    }
}

class Grade extends Average
{
    public char gradeCalc(double avg)
    {
        if(avg >= 90)
        {
            return 'O';
        }
        else if(avg >= 80 && avg < 90)
        {
            return 'A';
        }
        else if(avg >= 70 && avg < 80)
        {
            return 'B';
        }
        else if(avg >= 60 && avg < 70)
        {
            return 'C';
        }
        else if(avg >= 50 && avg < 60)
        {
            return 'D';
        }
        else 
        {
            return 'F';
        }
    }
}

public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int subject = sc.nextInt();

        System.out.println("Enter marks for each subject:");
        int marks[] = new int[subject];

        for (int i = 0; i < subject; i++) 
        {
            marks[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Total marks:");
        Total t = new Total();
        int total = t.totalMarks(marks);
        System.out.println(total);

        System.out.println("Average percentage:");
        Average av = new Average();
        double average = av.averageMarks(total, subject);
        System.out.printf("%.2f%%\n", average);

        System.out.println("Grade:");
        Grade g = new Grade();
        char grade = g.gradeCalc(average);
        System.out.println(grade);
    }
}
