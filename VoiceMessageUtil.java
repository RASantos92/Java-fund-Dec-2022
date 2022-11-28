import java.util.Date;
public class VoiceMessageUtil{

    public void greeting(String name) {
        System.out.println("Hello " + name);
    }
    public void greeting(int count) {
        System.out.println("Hello " + count + "from overloaded method");
    }

    public void getCurrentDate(){
        Date today = new Date();
        System.out.println("Hello, the current date is: " + today);
    }
}