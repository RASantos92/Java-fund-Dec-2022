import java.util.ArrayList;
public class Developer{
    // attributes
    public static int devCount;
    private String name;
    private boolean employed;
    private int salary;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;

    // constructor
    public Developer(){
        this.name = "no name yet";
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        devCount++;
    }

    public Developer(String name, boolean employed, int salary, double hoursOfSleep){
        this.name = name;
        this.employed = employed;
        this.salary = salary;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        devCount++;
    }



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

    // getters and setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getIsEmployed(){
        return this.employed;
    }

    public void setIsEmployed(boolean employed){
        this.employed = employed;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }

    public void setHoursOfSleep(double hoursOfSleep){
        this.hoursOfSleep = hoursOfSleep;
    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }

    public void setProjects(ArrayList<Project> projects){
        this.projects = projects;
    }
}