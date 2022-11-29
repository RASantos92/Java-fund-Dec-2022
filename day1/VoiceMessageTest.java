import java.util.ArrayList;
public class VoiceMessageTest{
    public static void main(String[] args){
        VoiceMessageUtil vmUtil = new VoiceMessageUtil();
        vmUtil.greeting("name");
        // vmUtil.greeting(5);
        // vmUtil.getCurrentDate();

        // const newArr = [1,2,1,5,47]

        // int[] messagesPerDay = new int[5];
        // messagesPerDay[0] = 5;
        // messagesPerDay[1] = 3;
        // messagesPerDay[2] = 55;

        // int[] messagesPerDay = {5,4,7,8};

        // String[] messagesPerDay = {"string1", "string2", "string3"};
        // System.out.println(vmUtil.totalMessages(messagesPerDay));
        // vmUtil.displayTodaysMessages(messagesPerDay);

        // for(int i = 0; i < messagesPerDay.length; i++){
        //     System.out.println(messagesPerDay[i]);
        // }


        int days = 7;
        double costOfLivingForADay = 10.99;
        double weeklyCostOfLiving = days * costOfLivingForADay; 
        System.out.println(weeklyCostOfLiving);

        int roundedWeeklyCostOfLiving = days * (int) costOfLivingForADay;
        System.out.println(roundedWeeklyCostOfLiving);

    }
}