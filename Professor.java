package src;

import java.util.ArrayList;

class Professor {

    public int id;
    public String name;
    public ArrayList<Student> studList;

    public Professor() {
        studList = new ArrayList<Student>();
    }

    public void setData(int professorId, String professorName) {
        id = professorId;
        name = professorName;
    }

    public void displayData() {
        System.out.println("ProfessorId:"+id);
        System.out.println("ProfessorName:"+name);
    }

    public boolean equals(Professor p) {
        if (p.id == id)
            return true;
        else
            return false;
    }

    public void assignStudent(Student std) {
        studList.add(std);
    }
}
