package co.edu.unbosque.controller.mok;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.edu.unbosque.model.Graduate;
import co.edu.unbosque.model.Project;
import co.edu.unbosque.model.adapter.DataMaper;
import co.edu.unbosque.model.persistence.DTO.GraduateDTO;
import co.edu.unbosque.model.persistence.DTO.ProjectDTO;

public class Builder {
	private ArrayList<Project> projects = new ArrayList<>();
	
	private List<Graduate> graduates = new ArrayList<>();

    public Builder() {
    	List<String> stack = new ArrayList<String>(
    												Arrays.asList("PHP", "SQLServer", "Laravel")
    											);
    	
    	projects.add(new Project(
    								"Enternova",
    								"Desarollador",
    								LocalDate.of(2024, 6, 25),
    								LocalDate.now(),
    								stack,
    								"Jaume"
    						)
    			);
        graduates.add(new Graduate(
        							"Jaume",
        							"Calle 4c",
        							"Bogota, Colombia",
        							"Desarrollador",
        							false,
        							"miphoto.img",
        							2,
        							projects
        						)
        		);
    }

    public List<GraduateDTO> getGraduateDTOs() {
        return DataMaper.graduadosDtoToModel(graduates);
    }
    
    public List<ProjectDTO> getProjectDTOs() {
    	return DataMaper.projectDtoToModel(projects);
    }
}
