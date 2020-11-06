import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
//        Set<Integer> integerSet = new TreeSet<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        Set<Integer> integerSet1 = new HashSet<>(integerList);
        System.out.println("cac phan tu trong set");
        for (int i:integerSet1
             ) {
            System.out.println(i);
        }
        //khai bao mang Integer
        Integer[] arrSet ={2,3,4,5};
        //chuyen mang thanh list
        List<Integer> list = Arrays.asList(arrSet);
        //chuyen list thanh set
        Set<Integer> integerSet2 = new HashSet<>(list);

        if (integerSet1.containsAll(integerSet2)){
            System.out.println("la tap con cua integerSet1");
        }else {
            System.out.println("khong la tap con cua integerSer1");
        }

        //gop integerSet2 voi integerSet1 set voi nhau
        integerSet1.addAll(integerSet2);
        System.out.println(integerSet1);
        //Toan tu giao(loai cac pt trong set1 nhung khong co trong set2)
        integerSet1.retainAll(integerSet2);
        System.out.println(integerSet1);

        Set<String> stringSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        stringSet.add("Dien");
        stringSet.add("Dai Cuong");
        stringSet.add("Tin");
        stringSet.add("Ngoai Ngu");

        Iterator<String> stringIterator = stringSet.iterator();
        System.out.println("cac khoa:");
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println("nhap ten khoa can them moi:");
        String tenkhoa = scanner.nextLine();
        if (stringSet.contains(tenkhoa)){
            System.out.println("ten" + tenkhoa+ "da co");
        }else {
            stringSet.add(tenkhoa);
            System.out.println("them thanh cong");
            stringIterator = stringSet.iterator();
            System.out.println("cac khoa sau khi them:");
            while (stringIterator.hasNext()){
                System.out.println(stringIterator.next());
            }
        }

        System.out.println("nhap khoa can xoa");
        tenkhoa = scanner.nextLine();
        if (stringSet.contains(tenkhoa)){
            stringSet.remove(tenkhoa);
            System.out.println("xoa khoa thanh cong");
            System.out.println("cac khoa sau khi xoa");
            stringIterator = stringSet.iterator();
            while (stringIterator.hasNext()){
                System.out.println(stringIterator.next());
            }
        }else {
            System.out.println("xoa khong thanh cong");
        }

    }
}
