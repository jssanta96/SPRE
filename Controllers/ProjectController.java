package Controllers;

import Logica.Project;
import Dao.ProjectDao;

public class ProjectController {

    ProjectDao projectDao;

    public ProjectController(){
        projectDao= new ProjectDao();
    }

    public int addProject(String code, String name, String description, String state){
        Project project= new Project();

        project.setCode(code);
        project.setName(name);
        project.setDescription(description);
        project.setState(state);


        System.out.println("Se va a insertar un Proyecto");

        int result=projectDao.saveProject(project);

        System.out.println("Se inserto un nuevo Proyecto");

        return result;

    }

    public Project viewProject(String code){

        Project project = new Project();

        System.out.println("Se va a consultar un paciente");

        project = projectDao.viewProject(code);

        return project;

    }

    public void updateProject(String code, String name, String description, String state){
        projectDao.updateProject(code,name,description,state);
    }

    public void deleteProject(String code){
        projectDao.deleteProject(code);
    }
}
