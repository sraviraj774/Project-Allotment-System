package src;

class Assignment {

    public static boolean assignProject(Professor prof, Student stud, Project proj) {

        if (stud.getProfessorDetails() == null) {
            if (stud.getProjectDetails() == null) {
                prof.assignStudent(stud);
                stud.assignProfessor(prof);
                stud.assignProject(proj);
                return true;
            } else
                return false;
        } else
            return false;
    }
}
