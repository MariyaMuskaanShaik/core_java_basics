public class Constructor {
    Constructor()
    {
        System.out.println("obj created");
    }
    Constructor(int a)
    {
        System.out.println("a="+a);
    }
    public static void main(String[] args) {
        Constructor c = new Constructor(5);
    }
}
