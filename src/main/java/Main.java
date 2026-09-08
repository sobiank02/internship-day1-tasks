import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    // PostgreSQL connection details
    static final String URL =
            "jdbc:postgresql://localhost:5432/internship_day1";

    static final String USERNAME =
            "postgres";

    static final String PASSWORD =
            "snk2005";


    public static void main(String[] args) {

        Connection connection = null;

        try {

            // =====================================
            // 1. LOAD JDBC DRIVER
            // =====================================

            Class.forName("org.postgresql.Driver");

            // =====================================
            // 2. CONNECT TO DATABASE
            // =====================================

            connection = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );

            System.out.println("Connected successfully!");


            // =====================================
            // 3. INSERT
            // =====================================

            insertStudent(connection);


            // =====================================
            // 4. GET ALL STUDENTS
            // =====================================

            getAllStudents(connection);


            // =====================================
            // 5. UPDATE
            // =====================================

            updateStudent(connection);


            System.out.println("\nAfter UPDATE:");

            getAllStudents(connection);


            // =====================================
            // 6. DELETE
            // =====================================

            deleteStudent(connection);


            System.out.println("\nAfter DELETE:");

            getAllStudents(connection);


        } catch (ClassNotFoundException e) {

            System.out.println("JDBC Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("Database error.");
            e.printStackTrace();

        } finally {

            // =====================================
            // 7. CLOSE CONNECTION
            // =====================================

            if (connection != null) {

                try {

                    connection.close();

                    System.out.println(
                            "\nConnection closed."
                    );

                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
        }
    }


    // ==================================================
    // INSERT STUDENT
    // ==================================================

    public static void insertStudent(Connection connection)
            throws SQLException {

        String sql =
                "INSERT INTO students (name, age) " +
                "VALUES (?, ?)";

        PreparedStatement statement = null;

        try {

            statement = connection.prepareStatement(sql);

            statement.setString(1, "Sobia");
            statement.setInt(2, 21);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " student inserted successfully."
            );

        } finally {

            if (statement != null) {
                statement.close();
            }
        }
    }


    // ==================================================
    // GET ALL STUDENTS
    // ==================================================

    public static void getAllStudents(Connection connection)
            throws SQLException {

        String sql =
                "SELECT id, name, age " +
                "FROM students " +
                "ORDER BY id";

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            System.out.println("\n----- STUDENTS -----");

            while (resultSet.next()) {

                int id =
                        resultSet.getInt("id");

                String name =
                        resultSet.getString("name");

                int age =
                        resultSet.getInt("age");

                System.out.println(
                        id + " | " +
                        name + " | Age: " +
                        age
                );
            }

        } finally {

            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }
        }
    }


    // ==================================================
    // UPDATE STUDENT
    // ==================================================

    public static void updateStudent(Connection connection)
            throws SQLException {

        String sql =
                "UPDATE students " +
                "SET name = ?, age = ? " +
                "WHERE id = ?";

        PreparedStatement statement = null;

        try {

            statement = connection.prepareStatement(sql);

            statement.setString(1, "Sobia Khan");
            statement.setInt(2, 22);
            statement.setInt(3, 11);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " student updated successfully."
            );

        } finally {

            if (statement != null) {
                statement.close();
            }
        }
    }


    // ==================================================
    // DELETE STUDENT
    // ==================================================

    public static void deleteStudent(Connection connection)
            throws SQLException {

        String sql =
                "DELETE FROM students " +
                "WHERE id = ?";

        PreparedStatement statement = null;

        try {

            statement = connection.prepareStatement(sql);

            statement.setInt(1, 11);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " student deleted successfully."
            );

        } finally {

            if (statement != null) {
                statement.close();
            }
        }
    }
}