import java.util.*;
import java.util.stream.Collectors;

public class HW4 {
    public static void main(String[] args) {
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
        //1
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                System.out.print(list1.get(i) + " ");
            }
        }
        System.out.println();

        //2
        int temp = 0;
        for (int j = 0; j < list1.size(); j++) {
            if (list1.get(j) % 2 != 0) {
                temp = temp + 1;
            }
        }
        System.out.println(temp);

        //3
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        for (int k = 0; k < list2.size() / 2; k++) {
            System.out.print(list2.get(k) + " ");
        }
        System.out.println();

        //4
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println();

        //5
        list1.sort((a, b) -> Double.compare(b, a));
        System.out.println(list1);
        System.out.println();
        //5/2
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        //6
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

        //7???
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13);
        List<String> stringsFromINT = list4.stream().map(Object::toString)
                .collect(Collectors.toList());
        stringsFromINT.stream().findAny().orElse("1");
        System.out.println(stringsFromINT);

        //8???

        //9???


        //10
        int p = list4.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
        System.out.println(p);
       OptionalDouble d = list4.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();
        System.out.println(d);
    }
}


