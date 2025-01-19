public class HashMap {

    int default_capacity = 1 << 4;
    int max_capacity = 1 << 30;
    Entry hashMap[];

    HashMap(){
        hashMap = new Entry[default_capacity];
    }

    HashMap(int capacity){
        int tableSize = tableSizeFor(capacity);
        hashMap = new Entry[tableSize];
    }

    private int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= max_capacity) ? max_capacity : n + 1;
    }


    public void put(Integer key, String value) {
        int hashCode = key.hashCode() % hashMap.length;
        Entry node = hashMap[hashCode];
        Entry newEntry = new Entry(key, value);
        if(node == null){
           hashMap[hashCode] = newEntry;
        }else{
            while(node.next != null){
                if(node.key == key){//If the key is already present then update the value only
                    node.val = value;
                    return;
                }
                node = node.next;
            }
            node.next = newEntry;
        }
    }

    public String get(Integer key) {
        int hashCode = key.hashCode() % hashMap.length;
        Entry node = hashMap[hashCode];
        while(node != null){
            if(node.key == key){
                return node.val;
            }
            node = node.next;
        }
        return "Not Present";
    }
}
