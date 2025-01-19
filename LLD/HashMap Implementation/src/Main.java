public class Main {
    public static void main(String[] args) {

        HashMap map = new HashMap(5);
        map.put(2, "Surya");
        map.put(1, "Vinay");
        map.put(8, "Anjali");
        map.put(22, "Pgla");
        map.put(13, "Ki");
        System.out.println("CAll GET METHOD");
        System.out.println(map.get(8));
        System.out.print("------ HASHMAP ------" + map.toString());
    }
}