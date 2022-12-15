package src;

class Student {

    public int studentId;
    public String studentName;
    public Project ptrProject;
    public Professor ptrProfessor;

    public void setData(int id, String name) {
        studentId = id;
        studentName = name;
    }

    public void displayData() {
        System.out.println("StudentId:"+studentId);
        System.out.println("StudentName:"+studentName);       
    }

    public boolean equals(Student std) {
        if (std.studentId == studentId)
            return true;
        else
            return false;
    }

    public Project getProjectDetails() {
        return ptrProject;
    }

    public Professor getProfessorDetails() {
        return ptrProfessor;
    }

    public void assignProject(Project prj) {
        ptrProject = prj;
    }

    public void assignProfessor(Professor prf) {
        ptrProfessor = prf;
    }

}
