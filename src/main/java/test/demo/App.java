package test.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 0;
        try {
        	int b = 3/a;
        	System.out.println("after b");
        }catch (Exception e) {
        	e.printStackTrace();
        }
        System.out.println("c");
    }
}
