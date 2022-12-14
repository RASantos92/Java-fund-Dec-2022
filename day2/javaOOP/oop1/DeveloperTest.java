import java.util.ArrayList;
public class DeveloperTest {
    public static void main(String[] args){
        System.out.println("---------Developer Test---------");

        Developer dev1 = new Developer("Radyn Greenwell",true,100000,5.2);

        ArrayList<String> lang = new ArrayList<String>();
        lang.add("Java");
        lang.add("Python");

        dev1.setLanguages(lang);

        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "Python";


        Project project2 = new Project();
        project2.title = "Netflix Clone";
        project2.language = "Java";
        
        dev1.addProject(project1);
        dev1.addProject(project2);

        System.out.println(dev1.displayStats());
    }
}