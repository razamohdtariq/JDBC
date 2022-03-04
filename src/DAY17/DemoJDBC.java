package DAY17;

import java.sql.*;


public class DemoJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tariq","root","Raza@$786");
Statement st=con.createStatement();
//String query="create table student(ID int primary key, SName varchar(30), SMarks int)";
String query1 ="insert into student values(3,'Ali',28)";
//String query = "Select * FROM student";
ResultSet rs= st.executeQuery("SELECT ID, SName, SMarks FROM student");  
while(rs.next())
{
    System.out.println(rs.getString(1));  
    System.out.println(rs.getString(2)); 
    System.out.println(rs.getString(3));  
  }
//st.executeUpdate(query1);
//System.out.println("Student Table created successfully");

System.out.println("Row inserted successfully");

st.close();
con.close();
}

}

