import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isAllowed(String name, HashSet<String> allowed){
        if (allowed.contains(name)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        //1. Unique integers
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> uniquenum = new HashSet<>();

        System.out.println("Enter integers: ");
        String in = scanner.nextLine();
        String[] parts = in.split(" ");

        for (int i = 0; i < parts.length; i++){
            int val = Integer.parseInt(parts[i]);
            uniquenum.add(val);
        }

        System.out.println("Unique integers: ");
        for(int num : uniquenum){
            System.out.print(num + " ");
        }

        //2. Check membership
        HashSet<String> allowed = new HashSet<>();
        allowed.add("Adilya");
        allowed.add("Aida");
        allowed.add("Albina");
        allowed.add("Nurs");
        allowed.add("Beka");

        System.out.println();
        System.out.println("\nEnter a username to check: ");
        String user = scanner.nextLine();

        boolean result = isAllowed(user, allowed);
        System.out.println(result);

        //3. Set size & Emptiness
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(1);
        nums.add(7);
        nums.add(653);
        nums.add(148);

        System.out.println();
        System.out.println("Size of set: " + nums.size());

        nums.clear();

        System.out.println("Is the set empty? " + nums.isEmpty());
        //4. Remove elements
        HashSet<String> names = new HashSet<>();
        names.add("Rayana");
        names.add("Nurai");
        names.add("Marsel");
        names.add("Elon");
        names.add("Rose");

        boolean removed = names.remove("Marsel");
        System.out.println();
        System.out.println("Removal successful: " + removed);
        System.out.println("Names in the set: " + names);

        //5. Bulk add
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1230);
        set1.add(341);
        set1.add(7);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(98);
        set2.add(996);
        set2.add(45);

        set1.addAll(set2);
        System.out.println();
        System.out.println("Resulting set: " + set1);

        //6. Bulk remove
        HashSet<String> setA = new HashSet<>();
        setA.add("Hi");
        setA.add("Hello");
        setA.add("Halo");
        setA.add("Hola");

        HashSet<String> setB = new HashSet<>();
        setB.add("Hola");
        setB.add("Bonjour");
        setB.add("Ni-hao");
        setB.add("Halo");

        setA.removeAll(setB);
        System.out.println();
        System.out.println("Modified set A: " + setA);

        //7. Retain common
        HashSet<String> setX = new HashSet<>();
        setX.add("A");
        setX.add("B");
        setX.add("C");
        setX.add("D");

        HashSet<String> setY = new HashSet<>();
        setY.add("B");
        setY.add("C");
        setY.add("D");
        setY.add("E");

        setX.retainAll(setY);
        System.out.println();
        System.out.println("Common elements: " + setX);

        //8. Contains all
        HashSet<String> seta = new HashSet<>();
        seta.add("Lisa");
        seta.add("Rose");
        seta.add("Jennie");
        seta.add("Jisoo");

        HashSet<String> setb = new HashSet<>();
        setb.add("Jennie");
        setb.add("Rose");

        System.out.println();
        if (seta.containsAll(setb)){
            System.out.println("Yes! setA contains all elements of setB.");
        } else {
            System.out.println("No, setA does not contain of setB.");
        }

        //9. Dedublicate Words
        System.out.println();
        System.out.println("Enter a sentence: ");
        String sent = scanner.nextLine();

        String[] words = sent.split(" ");
        HashSet<String> unique = new HashSet<>();

        for (String word : words){
            unique.add(word);
        }

        System.out.println("Unique words: ");
        for(String word : unique){
            System.out.println(word + " ");
        }


        //10. Case-insensitive unique words

        System.out.println();
        System.out.println("Enter words (case-insensitive): ");
        String input = scanner.nextLine();

        String[] wordie = input.split(" ");
        HashSet<String> uniwords = new HashSet<>();

        for (String word : wordie){
            uniwords.add(word.toLowerCase());
        }

        System.out.println("Unique words: ");
        for (String word : uniwords) {
            System.out.print(word + " ");
        }
    }
}