package src;

class Project {

    public int projectId;
    public String projectTitle;

    public void setData(int id, String title) {
        projectId = id;
        projectTitle = title;
    }

    public void displayData() {
        System.out.println("ProjectId:"+projectId);
        System.out.println("ProjectTitle:"+projectTitle);
    }

    public boolean equals(Project p) {
        if (p.projectId == projectId)
            return true;
        else
            return false;
    }
}
