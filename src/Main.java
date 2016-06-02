
public class Main {

    public static void main(String[] args) {
        YmhLinkedList list = new YmhLinkedList();
        list.add("21213");
        list.add("asfd");
        list.add("2121asdas3");
        list.add("212ewdsadcx13");
        list.add(1, 132);
        list.set(2, "test");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
