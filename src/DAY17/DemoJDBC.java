package DAY17;

import java.sql.*;


public class DemoJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tariq","root","Raza@$786");
Statement st=con.createStatement();
//String query="create table student(ID int primary key, SName varchar(30), SMarks int)";
//String query1 ="insert into student values(3,'Ali',28)";
//String query2= "Delete from student Where ID=3";
String query3= "Update student Set SName='Abhishek' Where ID=2";
//st.executeUpdate(query);
st.executeUpdate(query3);
//System.out.println("Student Table created  successfully");
System.out.println("Row Delete successfully");
st.close();
con.close();

	}

}
