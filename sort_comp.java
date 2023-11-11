//sort the students name using comparator interface

import java.util.*;
public class student_dta implements Comparator
{
    public static void main(String[] args) 
    {
        int i,n=3;
        student s[] = new student[n];
        Scanner obj = new Scanner(System.in);
        ArrayList list = new ArrayList(Arrays.asList());
        for(i=0;i<n;i++)
        {
            System.out.println("\nStudent "+(i+1));
            System.out.print("Name:");
            String name= obj.next();
            System.out.print("Roll.No:");
            int r_no= obj.nextInt();
            System.out.print("CGPA:");
            float cgpa= obj.nextFloat();
            s[i]= new student(name,r_no,cgpa);
            list.add(s[i]);
        }
        Object[] ob = list.toArray();
        student_dta comp = new student_dta(); 
        for(i=0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                int l = comp.compare(ob[i],ob[j]);
                if(l>0)
                {                 
                    String temp = s[i].name;
                    s[i].name = s[j].name;
                    s[j].name = temp;
                }
            }    
        }
        System.out.println("\nName\tRoll.No\tCPGA");
        for(i=0;i<n;i++)
            System.out.println(s[i]);
    }
    public int compare(Object t, Object t1) {
        student s1 = (student)t;
        student s2 = (student)t1;
        return s1.name.compareTo(s2.name);
    }
}
class student 
{
    String name;
    int r_no;
    float cgpa;
    student(String n, int r, float cgpa)
    {
        name = n;
        r_no = r;
        this.cgpa = cgpa;
    }
    public String toString()
    {
        return name+"\t"+r_no+"\t"+cgpa;
    }
}
