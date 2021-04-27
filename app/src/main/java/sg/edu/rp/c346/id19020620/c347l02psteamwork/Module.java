package sg.edu.rp.c346.id19020620.c347l02psteamwork;

public class Module {

    private String moduleName;
    private int moduleWeek;
    private String moduleGrade;

    public Module(String moduleName, int moduleWeek, String moduleGrade) {
        this.moduleName = moduleName;
        this.moduleWeek = moduleWeek;
        this.moduleGrade = moduleGrade;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleWeek() {
        return moduleWeek;
    }

    public void setModuleWeek(int moduleWeek) {
        this.moduleWeek = moduleWeek;
    }

    public String getModuleGrade() {
        return moduleGrade;
    }

    public void setModuleGrade(String moduleGrade) {
        this.moduleGrade = moduleGrade;
    }
}
