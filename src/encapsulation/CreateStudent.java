package encapsulation;

class Student
{
 //attributes
 private int studentId;
 private String studentName=null;
 private long studentPhoneNumber;
 private String studentAddress=null;
 private String studentMailId=null;
 private String studentDegree=null;
 private int YOP;
//Constructors
 Student(int studentId,String studentName,long
studentPhoneNumber)
 {
 this.studentId=studentId;
 this.studentName=studentName;
 this.studentPhoneNumber=studentPhoneNumber;
 }
 Student(int studentId,String studentName,String StudentMailId)
 {
 this.studentId=studentId;
 this.studentName=studentName; this.studentName=studentName;
 this.studentMailId=studentMailId;
 }
 int getStudentId()
 {
 return studentId;
 }
String getStudentName()
{
 return studentName;
}
long getStudentPhoneNumber()
{
 return studentPhoneNumber;
}
String getStudentMailId()
{
 return studentMailId;
}
String getStudentAddress()
{
 return studentAddress;
}
String getStudentDegree()
{
 return studentDegree;
}
int getStudentYOP()
{
 return YOP;
}
void setStudentPhoneNumber(long studentPhoneNumber)
{
 this.studentPhoneNumber=studentPhoneNumber;
}
void setStudentMailId(String studentMailId)
{
this.studentMailId=studentMailId;
}
void setStudentAddress(String studentAddress)
{
 this.studentAddress=studentAddress;
}
void printStudentDetails()
{
 System.out.println("Student Id:" + studentId);
 System.out.println("Student Name:" + studentName);
 System.out.println("Student PhoneNo:" + studentPhoneNumber);
 System.out.println("Student MailId:" + studentMailId);
 System.out.println("Student Address:" + studentAddress);
 System.out.println("Student Address:" + studentAddress);
 System.out.println("Student Degree:" + studentDegree);
 System.out.println("Student YOP:" + YOP);
 }
}
class CreateStudent
{
 public static void main(String[] args)
 {
 Student s1=new Student(1,"YoyoHoneySingh",987654321l);
 Student s2=new Student(2,"AamirKhan","aamir@pk.com");
 System.out.println(s1.getStudentName());
 s1.setStudentPhoneNumber(80000000);
 System.out.println(s1.getStudentPhoneNumber());
 s2.printStudentDetails();
 }
}