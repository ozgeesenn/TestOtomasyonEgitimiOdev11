public class Singleton {

    private static Singleton instance;

    //Constructor method
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (instance==null)
        {
            instance=new Singleton();
        }

        return instance;
    }

    public void methodYazdir()
    {
        System.out.println("Singleton example örneği tamamlandı!");
    }

}
