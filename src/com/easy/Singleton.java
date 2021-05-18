public class Singleton {
    private static Singleton instance = null;
    public String s;

    private Singleton() {
        s = "Welcome to Singleton class example";
        System.out.println("In private constructor " + this);
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void main(String[] args) throws Exception {
        Singleton x = getInstance();
        Singleton y = getInstance();
        System.out.println(x);
        System.out.println(y);
    }
}