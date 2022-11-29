import java.util.ArrayList;
public class Developer{
    // attributes
    public String name;
    public ArrayList<String> languages;
    public boolean employed;
    public int salary;
    public double hoursOfSleep;
    public ArrayList<Project> projects = new ArrayList<Project>();

    // methods
    public String displayStats(){
        String output = "name: " + this.name + "\n";
        output += "salary: " + this.salary + "\n";
        output += "empolyed: " + this.employed + "\n";
        output += "hours of sleep: " + this.hoursOfSleep + "\n";
        output += "languages: " + this.languages + "\n";
        output += "projects: \n";
        for(Project project : this.projects){
            output += project.displayInfo();
        }
        return output;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }
}