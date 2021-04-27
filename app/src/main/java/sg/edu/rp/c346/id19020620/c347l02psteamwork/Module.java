package sg.edu.rp.c346.id19020620.c347l02psteamwork;

public class Module {

    //---------------------Initial Setting--------------
    private int moduleWeek;
    private String moduleGrade;

    public Module(int moduleWeek, String moduleGrade) {

        this.moduleWeek = moduleWeek;
        this.moduleGrade = moduleGrade;
    }
    //---------------------Initial Setting--------------


    //---------------------Getter--------------
    public int getModuleWeek() {
        return moduleWeek;
    }
    public String getModuleGrade() {
        return moduleGrade;
    }
    //---------------------Getter--------------


    //---------------------Setter--------------
    public void setModuleWeek(int moduleWeek) {
        this.moduleWeek = moduleWeek;
    }
    public void setModuleGrade(String moduleGrade) {
        this.moduleGrade = moduleGrade;
    }
    //---------------------Setter--------------
}

