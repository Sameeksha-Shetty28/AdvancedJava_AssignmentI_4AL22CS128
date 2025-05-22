
<! 9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively!>

<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Employee</title></head>
<body>
<h2>Delete Employees with Names Starting with 'S'</h2>
<form method="post">
    <input type="submit" value="Delete Records Starting with 'S'">
</form>

<%
if ("post".equalsIgnoreCase(request.getMethod())) {
    try {
        // Load JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        // Prepare and execute delete statement
        PreparedStatement ps = con.prepareStatement("DELETE FROM Emp WHERE Emp_Name LIKE 'S%'");
        int count = ps.executeUpdate();

        // Show result
        out.println("<p style='color:red;'>" + count + " record(s) deleted.</p>");

        ps.close();
        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
}
%>

<h3>Salary Report</h3>
<%
try {
    // Load JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Connect again to fetch data
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

    // Query the updated employee table
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
Emp_No : <%= rs.getInt("Emp_NO") %><br>
Emp_Name: <%= rs.getString("Emp_Name") %><br>
Basic : <%= rs.getInt("Basicsalary") %><br>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
<%
    }

    rs.close();
    st.close();
    con.close();
} catch (Exception e) {
    out.println("<p style='color:red;'>Error loading report: " + e.getMessage() + "</p>");
}
%>
</body>
</html>
