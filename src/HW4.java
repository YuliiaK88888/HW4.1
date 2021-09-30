import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class HW4 {


    public static void main(String[] args) {
        first();
        second();
        third();
        forts();
        fifths();
        six();
        sevenths();
        eights();
        nine();
        ten();
        two_one();
        two_two();

    }

    public static void first() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                System.out.print(list1.get(i) + " ");
            }
        }
        System.out.println();

    }

    public static void second() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        int temp = 0;
        for (int j = 0; j < list1.size(); j++) {
            if (list1.get(j) % 2 != 0) {
                temp = temp + 1;
            }
        }
        System.out.println(temp);
    }

    public static void third() {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(8);
        list2.add(9);
        list2.add(12);
        list2.add(2);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        for (int k = 0; k < list2.size() / 2; k++) {
            System.out.print(list2.get(k) + " ");
        }
        System.out.println();

        //3.2
        list2.stream().limit(5).forEach(System.out::print);
        System.out.println();
    }

    public static void forts() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        Collections.sort(list1);
        System.out.println(list1);
        System.out.println();

    }

    public static void fifths() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(9);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(17);
        list1.add(22);
        list1.add(19);
        list1.add(1);
        list1.add(7);
        list1.add(10);
        list1.add(15);
        list1.add(100);

        list1.sort((a, b) -> Double.compare(b, a));
        System.out.println(list1);
        System.out.println();
        //5/2
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

    }

    public static void six() {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(2);
        list3.add(3);
        list3.add(5);
        list3.add(5);
        list3.add(6);
        list3.add(8);
        list3.add(8);
        list3.add(10);
        list3.add(10);
        List<Integer> list1Distinct = list3.stream().distinct().collect(Collectors.toList());
        System.out.println(list1Distinct);
        System.out.println();
    }

    public static void sevenths() {

        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13);
        List<String> stringsFromINT = list4.stream().map(Object::toString)
                .collect(Collectors.toList());
        stringsFromINT.stream().findAny().orElse("1");
        System.out.println(stringsFromINT);
        System.out.println();
    }

    public static void eights() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(81);
        list.add(1);
        list.add(102);
        list.add(0);
        list.add(60);
        list.add(70);
        list.add(8);
        list.add(9);
        list.add(10);


        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > 30) {
                System.out.println(list.get(i));
                break;
            }
        }
        System.out.println();
    }

    public static void nine() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(39);
        list.add(51);
        list.add(15);
        list.add(26);
        list.add(38);
        list.add(83);
        list.add(0);
        list.add(120);

        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println();
        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
        System.out.println();

    }

    public static void ten() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(11);
        list.add(17);
        list.add(22);
        list.add(19);
        list.add(1);
        list.add(7);
        list.add(10);
        list.add(15);
        list.add(100);

        int p = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
        System.out.println(p);
        OptionalDouble d = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();
        System.out.println(d);
        System.out.println();

    }

    public static void two_one() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Hello!");
        list.add("Privet");
        list.add("Hello");
        list.add("Chao");
        list.add("Salut!");
        list = (ArrayList) list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            String newValue = list.get(i).toUpperCase(Locale.ROOT);
            list.set(i, newValue);
        }
        System.out.println(list);
        System.out.println();

    }

    public static void two_two() {
        Person a = new Person("Petrov", 30);
        Person b = new Person("Ivanov", 10);
        Person c = new Person("Sidorov", 55);
        Person d = new Person("Vasiliyev", 90);
        List<Person> persons = new ArrayList<>();
        persons.add(a);
        persons.add(b);
        persons.add(c);
        persons.add(d);
        persons.sort(comparing(Person::getSurname));

        for (Person person : persons) {
            if (person.age >= 30) {
                System.out.println(person.surname + " - " + person.age + " лет");
            }
        }
        //2 solution
//        for (int i = 0; i < persons.size(); i++) {
//            if (persons.get(i).getAge() >= 30) {
//                System.out.println(persons.get(i).getSurname());
//
//            }
//        }

        System.out.println();

//        for (Person person1 : persons) {
//            System.out.println(person1.getSurname());
//        }
//
//        public class PersonsComparer implements Comparator<Person> {
//            @Override
//            public int compare(ActiveAlarm x, ActiveAlarm y) {
//                // TODO: Handle null x or y values
//                int startComparison = compare(x.timeStarted, y.timeStarted);
//                return startComparison != 0 ? startComparison
//                        : compare(x.timeEnded, y.timeEnded);
//            }
//
//            // I don't know why this isn't in Long...
//            private static int compare(long a, long b) {
//                return a < b ? -1
//                        : a > b ? 1
//                        : 0;
//            }
//        }


    }
}



