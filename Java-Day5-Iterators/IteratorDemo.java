import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {

    public static void main(String[] args) {

        // ==============================
        // TASK 1: ITERATE LIST MANUALLY
        // ==============================

        List<String> students = new ArrayList<>();

        students.add("Sobia");
        students.add("Afiya");
        students.add("Umama");
        students.add("Roman");

        System.out.println("----- Using Iterator -----");

        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\n----- Using For-Each -----");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\n----- Using ListIterator in Reverse -----");

        ListIterator<String> listItr =
                students.listIterator(students.size());

        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }


        // ==============================
        // TASK 2: FAIL-FAST
        // ==============================

        System.out.println("\n----- Fail-Fast Example -----");

        ArrayList<String> doctors = new ArrayList<>();

        doctors.add("Dr. Ahmed");
        doctors.add("Dr. Khan");
        doctors.add("Dr. Sharma");

        try {

            Iterator<String> doctorIterator = doctors.iterator();

            while (doctorIterator.hasNext()) {

                String doctor = doctorIterator.next();

                System.out.println("Processing: " + doctor);

                doctors.add("Dr. New");

            }

        } catch (Exception e) {

            System.out.println("Exception occurred: "
                    + e.getClass().getSimpleName());

        }


        // ==============================
        // TASK 3: FAIL-SAFE
        // ==============================

        System.out.println("\n----- Fail-Safe Example -----");

        CopyOnWriteArrayList<Integer> numbers =
                new CopyOnWriteArrayList<>();

        numbers.add(1);
        numbers.add(2);

        for (Integer n : numbers) {

            System.out.println("Processing: " + n);

            numbers.add(3);

        }

        System.out.println("Final list: " + numbers);


        // ==============================
        // TASK 4: HOSPITAL SIMULATION
        // ==============================

        System.out.println("\n----- Hospital Simulation -----");

        ArrayList<String> doctorList = new ArrayList<>();

        doctorList.add("Dr. Ahmed");
        doctorList.add("Dr. Khan");
        doctorList.add("Dr. Sharma");

        System.out.println("\nFail-Fast Doctor List:");

        try {

            Iterator<String> doctorItr =
                    doctorList.iterator();

            while (doctorItr.hasNext()) {

                String doctor = doctorItr.next();

                System.out.println("Doctor being processed: "
                        + doctor);

                doctorList.add("Dr. Emergency");

            }

        } catch (Exception e) {

            System.out.println("Fail-Fast Result: "
                    + e.getClass().getSimpleName());

        }


        System.out.println("\nFail-Safe Doctor Live Update List:");

        CopyOnWriteArrayList<String> liveDoctors =
                new CopyOnWriteArrayList<>();

        liveDoctors.add("Dr. Ahmed");
        liveDoctors.add("Dr. Khan");
        liveDoctors.add("Dr. Sharma");

        for (String doctor : liveDoctors) {

            System.out.println("Doctor being processed: "
                    + doctor);

            liveDoctors.add("Dr. Emergency");

        }

        System.out.println("Fail-Safe Result: No exception");
        System.out.println("Updated list: " + liveDoctors);
    }
}