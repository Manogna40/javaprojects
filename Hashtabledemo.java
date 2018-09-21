package filesinjava;
import java.util.Hashtable;
import java.util.Scanner;
class student
{
	public String name;
	public int rollno;
	public String toString() {
		return "student name=" + name + "\n rollno=" + rollno+"\n\n";
	}

}
public class Hashtabledemo {
	
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of students");
int n=sc.nextInt();
student []s=new student[n];
Hashtable<student, String> h=new Hashtable<student, String>();
for(int i=0;i<n;i++)
{
	
    student obj=new student();
    System.out.println("name");
	obj.name=sc.next();
	System.out.println("rollno");
	obj.rollno=sc.nextInt();
	s[i]=obj;
	h.put(s[i], obj.toString());
	
}

System.out.println("enter roll number of student to remove");
int m=sc.nextInt();
for(int i=0;i<n;i++)
{
if(m==s[i].rollno)
{
	h.remove(s[i]);
	System.out.println("removed and other sutends are\n");
	
}

}
for(int i=0;i<n;i++)
{
	System.out.println(h.get(s[i]));
}
}

}