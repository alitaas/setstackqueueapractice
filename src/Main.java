import java.util.ArrayDeque;
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
        System.out.println("1. Unique integers:");
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
        System.out.println("2. Check membership");
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
        System.out.println("3. Set size & Emptiness");
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
        System.out.println("4. Remove elements");
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
        System.out.println("5. Bulk add");
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
        System.out.println("6. Bulk remove");
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
        System.out.println("7. Retain common");
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
        System.out.println("8. Contains all");
        if (seta.containsAll(setb)){
            System.out.println("Yes! setA contains all elements of setB.");
        } else {
            System.out.println("No, setA does not contain of setB.");
        }

        //9. Dedublicate Words
        System.out.println();
        System.out.println("9. Dedublicate words");
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
        System.out.println("10. Case-insensitive unique words");
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

        //11. basic offer/peek/poll
        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.offer(34);
        que.offer(12);
        que.offer(7);
        que.offer(4);

        System.out.println();
        System.out.println("11. Basic offer/peek/poll");
        System.out.println("Queue after offering elements: " + que);

        System.out.println("Peek element: " + que.peek());

        System.out.println("Polling elements: ");
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

        System.out.println("Queue after polling all elemnets: " + que);

        //12. stack behavior
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Apple");
        stack.push("Watermelon");
        stack.push("Plum");

        System.out.println();
        System.out.println("12. Stack behaviour");
        System.out.println("Popping items from the stacks: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        //13. add first/ last
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(2);
        deque.addFirst(1);

        deque.addLast(3);
        deque.addLast(4);

        System.out.println();
        System.out.println("13. Add first/last");
        System.out.println("Elements in the deque: ");
        for (int num : deque){
            System.out.println(num);
        }

        //14. offer first/ last return value
        ArrayDeque<Integer> deque1 = new ArrayDeque<>();

        boolean r1 = deque1.offerFirst(10);
        boolean r2 = deque1.offerLast(15);
        boolean r3 = deque1.offerFirst(5);
        boolean r4 = deque1.offerLast(30);

        System.out.println();
        System.out.println("14. Offer first/ last return value");
        System.out.println("offerFirst(10): " + r1);
        System.out.println("offerFirst(15): " + r2);
        System.out.println("offerFirst(5): " + r3);
        System.out.println("offerFirst(30): " + r4);

        System.out.println("Deque elements: ");
        for (int num : deque1){
            System.out.println(num);
        }

        //15. peek variants
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();
        deque2.add(10);
        deque2.add(20);
        deque2.add(30);

        System.out.println();
        System.out.println("15. Peek variants");
        System.out.println("Deque: " + deque2);
        System.out.println("peek(): " + deque2.peek());
        System.out.println("peekFirst(): " + deque2.peekFirst());
        System.out.println("peekLast(): " + deque2.peekLast());

        deque2.clear();

        System.out.println("\nDeque after cleaning: " + deque2);

        System.out.println("peek(): " + deque2.peek());
        System.out.println("peekFirst(): " + deque2.peekFirst());
        System.out.println("peekLast(): " + deque2.peekLast());

        //16. poll variants
        ArrayDeque<String> deque3 = new ArrayDeque<>();
        deque3.add("one");
        deque3.add("two");
        deque3.add("three");
        deque3.add("four");

        System.out.println("16. Poll variants");
        System.out.println("\nUsing pollFirst():");
        while (!deque3.isEmpty()){
            System.out.println(deque3.pollFirst());
        }

        deque3.add("one");
        deque3.add("two");
        deque3.add("three");
        deque3.add("four");

        System.out.println("\nUsing pollLast(): ");
        while(!deque3.isEmpty()){
            System.out.println(deque3.pollLast());
        }

        //17. remove first/ last occurrence
        ArrayDeque<String> deque4 = new ArrayDeque<>();
        deque4.add("a");
        deque4.add("b");
        deque4.add("c");
        deque4.add("b");
        deque4.add("a");

        System.out.println();
        System.out.println("17. Remove first/last occurrence");
        System.out.println("Original deque: " + deque4);

        deque4.removeFirstOccurrence("b");
        System.out.println("After removeFirstOccurrence(): " + deque4);
        deque4.removeLastOccurrence("b");
        System.out.println("After removeLastOccurrence():" + deque4);

        //18. isEmpty & Size
        ArrayDeque<Integer> deque5 = new ArrayDeque<>();
        System.out.println();
        System.out.println("18. isEmpty & Size");
        System.out.println("Size: " + deque5.size() + ", isEmpty: " + deque5.isEmpty());

        deque5.add(453);
        System.out.println("After add(453) -> Size: " + deque5.size() + ", isEmpty: " + deque5.isEmpty());

        deque5.add(78);
        System.out.println("After add(78) -> Size: " + deque5.size() + ", isEmpty: " + deque5.isEmpty());

        deque5.poll();
        System.out.println("After poll() -> Size: " + deque5.size() + ", isEmpty: " + deque5.isEmpty());

        deque5.poll();
        System.out.println("After poll() -> Size: " + deque5.size() + ", isEmpty: " + deque5.isEmpty());

        //19. clear deque
        ArrayDeque<Integer> degue6 = new ArrayDeque<>();
        degue6.add(66);
        degue6.add(83);
        degue6.add(702);

        System.out.println();
        System.out.println("19. Clear deque");
        System.out.println("Deque before clear: " + degue6);
        degue6.clear();

        System.out.println("Deque after clear: " + degue6);

        System.out.println("peek(): " + degue6.peek());
        System.out.println("isEmpty(): " + degue6.isEmpty());

        //20. palindrome check
        String inout = "racecar";
        System.out.println();
        System.out.println("20. Palindrome check");
        System.out.println("Input: " + inout);
        String str = inout.toLowerCase().replaceAll("\\s+", "");

        ArrayDeque<Character> dequ = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            dequ.add(c);
        }

        boolean ispalin = true;

        while (dequ.size()>1){
            char front = dequ.pollFirst();
            char back = dequ.pollLast();
            if(front != back) {
                ispalin = false;
                break;
            }
        }

        if (ispalin) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        //21. model a task scheduler system
        System.out.println();
        System.out.println("21. Model a task scheduler system");
        ArrayDeque<String> taskqu = new ArrayDeque<>();
        addtask(taskqu, "Update report", false);
        addtask(taskqu, "Fix critical bug", true);
        addtask(taskqu, "Email client", false);
        addtask(taskqu, "Server maintenance", true);

        System.out.println("\nTasks in queue: " + taskqu + "\n");

        while (!taskqu.isEmpty()){
            processtask(taskqu);
        }
        System.out.println("\nAll tasks processed. Queue empty: " + taskqu.isEmpty());
    }

    public static void addtask(ArrayDeque<String> qu, String task, boolean highpriority){
        if(highpriority) {
            qu.addFirst(task);
            System.out.println("Added HIGH priority task: " + task);
        } else {
            qu.addLast(task);
            System.out.println("Added normal task: " + task);
        }
    }

    public static void processtask(ArrayDeque<String> quu) {
        String task = quu.pollFirst();
        System.out.println("Processing task: " + task);
    }
}