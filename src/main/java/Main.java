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
            // 4. SELECT
            // =====================================

            selectStudents(connection);


            // =====================================
            // 5. UPDATE
            // =====================================

            updateStudent(connection);


            // Show updated record
            System.out.println("\nAfter UPDATE:");

            selectStudents(connection);


            // =====================================
            // 6. DELETE
            // =====================================

            deleteStudent(connection);


            // Show final records
            System.out.println("\nAfter DELETE:");

            selectStudents(connection);


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
                "INSERT INTO students " +
                "(id, name, email, dept_id) " +
                "VALUES (?, ?, ?, ?)";

        PreparedStatement statement = null;

        try {

            statement = connection.prepareStatement(sql);

            statement.setInt(1, 11);
            statement.setString(2, "Rahul");
            statement.setString(3, "rahul@gmail.com");
            statement.setInt(4, 1);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " student inserted successfully."
            );

        } finally {

            // Close PreparedStatement
            if (statement != null) {

                statement.close();
            }
        }
    }


    // ==================================================
    // SELECT STUDENTS
    // ==================================================

    public static void selectStudents(Connection connection)
            throws SQLException {

        String sql =
                "SELECT id, name, email, dept_id " +
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

                String email =
                        resultSet.getString("email");

                int deptId =
                        resultSet.getInt("dept_id");

                System.out.println(
                        id + " | " +
                        name + " | " +
                        email + " | Department: " +
                        deptId
                );
            }

        } finally {

            // Close ResultSet
            if (resultSet != null) {

                resultSet.close();
            }

            // Close PreparedStatement
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
                "SET name = ?, email = ? " +
                "WHERE id = ?";

        PreparedStatement statement = null;

        try {

            statement = connection.prepareStatement(sql);

            statement.setString(
                    1,
                    "Rahul Sharma"
            );

            statement.setString(
                    2,
                    "rahul.sharma@gmail.com"
            );

            statement.setInt(3, 11);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " student updated successfully."
            );

        } finally {

            // Close PreparedStatement
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

            // Close PreparedStatement
            if (statement != null) {

                statement.close();
            }
        }
    }
}
