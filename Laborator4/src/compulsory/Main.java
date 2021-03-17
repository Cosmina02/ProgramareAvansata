package compulsory;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();
        // student objects using streams
        var students = IntStream.rangeClosed(0,3)
                .mapToObj(i -> new Student(faker.name().fullName()))
                .toArray(Student[]::new);
        // school objects using streams
        var highschools = IntStream.rangeClosed(0,2)
                .mapToObj(i -> new School(faker.university().name()))
                .toArray(School[]::new);

        highschools[0].setCapacity(1);
        highschools[1].setCapacity(2);
        highschools[2].setCapacity(2);

        List<Student> studentList = new LinkedList<>();
        studentList.addAll(Arrays.asList(students));

        Collections.sort(studentList,
                (Comparator.comparing(Student::getName)));

        Set<School> schoolList = new TreeSet<>();
        schoolList.addAll(Arrays.asList(highschools));

        Map<Student, List<School>> stdPrefMap = new HashMap<>();
        stdPrefMap.put(students[0], Arrays.asList(highschools[0], highschools[1], highschools[2]));
        stdPrefMap.put(students[1], Arrays.asList(highschools[0], highschools[1], highschools[2]));
        stdPrefMap.put(students[2], Arrays.asList(highschools[0], highschools[1]));
        stdPrefMap.put(students[3], Arrays.asList(highschools[0], highschools[2]));

        Map<School, List<Student>> hscPrefMap = new LinkedHashMap<>();
        // h0
        List<Student> prefList0 = new ArrayList<>();
        prefList0.add(students[3]);
        prefList0.add(students[0]);
        prefList0.add(students[1]);
        prefList0.add(students[2]);

        hscPrefMap.put(highschools[0], prefList0);

        //h1
        List<Student> prefList1 = new ArrayList<>();
        prefList1.add(students[0]);
        prefList1.add(students[2]);
        prefList1.add(students[1]);

        hscPrefMap.put(highschools[1], prefList1);

        //h2
        List<Student> prefList2 = new ArrayList<>();
        prefList2.add(students[0]);
        prefList2.add(students[1]);
        prefList2.add(students[3]);

        hscPrefMap.put(highschools[2], prefList2);

        System.out.println(hscPrefMap.toString());

        //Students that find acceptables some schools
        List<School> target = Arrays.asList(highschools[0], highschools[2]);
        List<Student> result = studentList.stream()
                .filter(std -> stdPrefMap.get(std).containsAll(target))
                .collect(Collectors.toList());
        System.out.println("Students that find these schools acceptable: "+highschools[0].getName()+", "+ highschools[2].getName()+" are "+result);

        // schools that have student x as a top preference
        List<School> result2 =schoolList.stream()
                .filter(hsc -> hscPrefMap.get(hsc).get(0).equals(students[0]))
                .collect(Collectors.toList());

        System.out.println("school"+schoolList);
        System.out.println("top student"+result2);

    }
}
