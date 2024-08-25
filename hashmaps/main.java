package hashmaps;
public class main {
    public static void main(String[] args) {
        CustomizedHashMaps cs = new CustomizedHashMaps(10); // Use the correct class name

        cs.insert(16);
        cs.insert(22);
        cs.insert(4);
        cs.insert(66);
        cs.insert(33);
        cs.remove(2);
        cs.display();
    }
}


