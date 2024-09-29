package Arrays;

import java.util.*;
import java.io.*;

public class arrlargestEle {
    public static Map<String, Integer> processData(ArrayList<String> array) {
        Map<String, Integer> departmentToMaxSalary = new HashMap<>();
        Map<String, Integer> departmentToMaxId = new HashMap<>();

        for (String line : array) {
            String[] fields = line.split(", ");
            int employeeId = Integer.parseInt(fields[0]);
            String department = fields[2];
            int salary;

            try {
                salary = Integer.parseInt(fields[3]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary entry: " + fields[3]);
                continue;
            }

            if (!departmentToMaxId.containsKey(department) || employeeId > departmentToMaxId.get(department)) {
                departmentToMaxId.put(department, employeeId);
                departmentToMaxSalary.put(department, salary);
            }
        }

        return departmentToMaxSalary;
    }

    public static void main(String[] args) {
        ArrayList<String> inputData = new ArrayList<>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while (in.hasNextLine())
                inputData.add(in.nextLine());
            in.close();

            Map<String, Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for (Map.Entry<String, Integer> e : retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}


