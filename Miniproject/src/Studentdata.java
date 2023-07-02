import java.sql.*;

	import java.util.Scanner;

public class Studentdata{

	    public static void main(String args[]) {

	        try{

	            Scanner sc = new Scanner(System.in);

	            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_details", "root", "root");

	            Statement st = connect.createStatement();

	            System.out.println("DATABASE CONFIGURE:");

	            System.out.println("Choose any of the below options:\n1.Update\n2.Delete\n3.Insert\n4.Show\n5.other choice to exit");

	            int choice = sc.nextInt();

	            while(choice == 1 || choice == 2 || choice ==3 || choice == 4) {

	                switch(choice) {

	                    case 1:

	                        System.out.println("Choose the column you wish to update:\n1.NAME\n2.REGISTER_NUMBER\n3.GENDER\n4.BLOOD_GROUP\n5.FATHER_NAME\n6.MOTHER_NAME\n7.STUDENT_MOBILE_NUMBER\n8.EMAIL\nAny other choice to complete your update");

	                        int choice2 = sc.nextInt();

	                        while (choice2 == 1 || choice2 == 2 || choice2 == 3) {

	                            switch (choice2) {

	                                case 1:

	                                    System.out.println("Enter the REGNO:");

	                                    String a = sc.nextLine();

	                                    System.out.println("Where you want to update(NAME)");

	                                    int b = sc.nextInt();

	                                    st.executeUpdate("update Student_information set NAME = '" + a + "' where REGISTER_NUMBER = "+b);

	                                    break;

	                                case 2:

	                                    System.out.println("Enter the NAME");

	                                    sc.nextLine();

	                                    String c = sc.nextLine();

	                                    System.out.println("Where you want to update(REGISTER_NUMBER)");

	                                    int d = sc.nextInt();

	                                    st.executeUpdate("update Student_information set REGISTER_NUMBER = '" + c + "' where NAME = " + d);

	                                    break;

	                                case 3:

	                                    System.out.println("Enter the value;");

	                                    sc.nextLine();

	                                    String e = sc.nextLine();

	                                    System.out.println("Where you want to update()");

	                                    int f = sc.nextInt();

	                                    st.executeUpdate("update avengers set NAME = '" + e + "' where REGISTER_NUMBER = " + f);

	                                    break;

	                            }

	                            System.out.println("Updated Successfully");

	                            System.out.println("Choose the column you wish to update:\n1.NAME\n2.REGISTER_NUMBER\n3.GENDER\n4.BLOOD_GROUP\n5.FATHER_NAME\n6.MOTHER_NAME\n7.STUDENT_MOBILE_NUMBER\n8.EMAIL\nAny other choice to complete your update");
	                            choice2 = sc.nextInt();

	                        }

	                        break;

	                    case 2:

	                        System.out.println("Enter the number of Student details you want to remove");

	                        int x = sc.nextInt();

	                        st.executeUpdate("delete from Student_information where REGISTER_NUMBER = " + x);

	                        System.out.println("Row Deleted Successfully");

	                        break;

	                    case 3:

	                        System.out.println("Enter the  Name:");
	                        sc.nextLine();
	                        String namez = sc.nextLine();
	                        System.out.println("Enter the Register number:");

	                        int numberz = sc.nextInt();

	                        System.out.println("Enter the gender:");
	                        sc.nextLine();

	                        String genderz = sc.nextLine();

	                        System.out.println("Enter the blood group:");

	                        String bloodz = sc.nextLine();

	                        System.out.println("Enter the fathername:");

	                        String fatherz = sc.nextLine();

	                        System.out.println("Enter the mothername:");

	                        String motherz = sc.nextLine();

	                        System.out.println("Enter the occuption:");

	                        String occuptionz = sc.nextLine();

	                        System.out.println("Enter the mobile:");

	                        int mobilez = sc.nextInt();
                            sc.nextLine();
	                        System.out.println("Enter the email:");

	                        String emailz = sc.nextLine();

	                        String query = "insert into Student_information (NAME,REGISTER_NUMBER,GENDER,BLOOD_GROUP,FATHER_NAME,MOTHER_NAME,FATHER_OCCUPTION,STUDENT_MOBILE_NUMBER,EMAIL)values ('" + namez + "', " + numberz + ",'" + genderz + "', '"+ bloodz +"' ,'" + fatherz +"','" +motherz +"', '" +occuptionz +"', " +mobilez + ", '" +emailz +"' )";

	                        st.executeUpdate(query);

	                        System.out.println("Successfully Inserted");

	                        break;

	                    case 4:

	                        ResultSet rs = st.executeQuery("select * from Student_information");

	                        System.out.println("NAME     REGISTER_NUMBER     GENDER     BLOOD_GROUP     FATHER_NAME     MOTHER_NAME     FATHER_OCCUPTION     STUDENT_MOBILE_NUMBER     EMAIL");

	                        while(rs.next()) { 

	                        String name = rs.getString("NAME");

	                        int register = rs.getInt("REGISTER_NUMBER");

	                        String gender = rs.getString("GENDER");

	                        String blood = rs.getString("BLOOD_GROUP");

	                        String father = rs.getString("FATHER_NAME");

	                        String mother = rs.getString("MOTHER_NAME");

	                        String occuption = rs.getString("FATHER_OCCUPTION");

	                        int number = rs.getInt("STUDENT_MOBILE_NUMBER");
                            
	                        String email = rs.getString("EMAIL");

	                        System.out.println(name + "     2 " + register + "        " + gender +"        "+blood+"        "+father+"       " +mother+"     "+occuption+"       "+number+"       "+email);

	                        }

	                        break;

	                }

	                System.out.println("Enter your choice:\n1.Update\n2.Delete\n3.Insert\n4.Show\nAny other choice to exit");

	                choice = sc.nextInt();

	            }

	            connect.close();

	            st.close();

	        }

	        catch (Exception e) {

	            System.out.println(e.toString());

	        }

	    }

	}



