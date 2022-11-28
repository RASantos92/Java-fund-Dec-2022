public class JavaBasic{

    public static void main(String[] args){
        System.out.println("Hello World");
        String firstName = "David";
        String lastName = "Parron";
        int age = 34;
        boolean isStudent = true;
        double weight = 178.32;
        char grade = 'A';
        System.out.println(firstName + " " + lastName);
        System.out.println("age: " + age + "\n" + "isStudent: " + isStudent + "\n" + "weight: " + weight);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(grade);

        // if(weight < 100){
        //     System.out.println("you need to gain some weight");
        // } else {
        //     System.out.println("you are all fine");
        // }
        System.out.println(weight<100?"you need to gain some weight":"you are all fine");

        String fullName = firstName.concat(lastName);
        System.out.println(fullName.length());

        // String greeting = String.format("Hi %s, you are %d years old", fullName, age);
        // System.out.println(greeting);
        System.out.printf("Hi %s , you are %d years old %n", fullName, age);

        String firstName1 = "Martha";
        String firstName2 = new String("Martha");
        String firstName3 = "Martha";
        System.out.println(firstName1 == firstName2); // false
        System.out.println(firstName1 == firstName3); // true
        System.out.println(firstName1.equals(firstName2)); // true
        
    }
}

