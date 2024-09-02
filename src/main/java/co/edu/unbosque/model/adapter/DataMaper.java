package co.edu.unbosque.model.adapter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import co.edu.unbosque.model.Contact;
import co.edu.unbosque.model.Graduate;
import co.edu.unbosque.model.Project;
import co.edu.unbosque.model.persistence.DTO.ContactDTO;
import co.edu.unbosque.model.persistence.DTO.GraduateDTO;
import co.edu.unbosque.model.persistence.DTO.ProjectDTO;

public class DataMaper {
	public static Contact dtoToModel(ContactDTO dto) {
        return new Contact(
            dto.getNameCompany(),
            dto.getEmailRRHH(),
            dto.getMessage(),
            dto.getExpirationJob(),
            dto.getNameGraduate()
        );
    }

    public static ContactDTO modelToDto(Contact model) {
        ContactDTO dto = new ContactDTO();
        
        model.setEmailRRHH(dto.getEmailRRHH());
        model.setExpirationJob(dto.getExpirationJob());
        model.setMessage(dto.getMessage());
        model.setNameCompany(dto.getNameCompany());
        model.setNameGraduate(dto.getNameGraduate());
        
        return dto;
    }
    
    public static Project dtoToModel(ProjectDTO dto) {
		return new Project(
				dto.getCompany(),
				dto.getRole(),
				dto.getInitialJob(),
				dto.getEndJob(),
				dto.getTechnologicalExperiences(),
				dto.getNameGraduate()
		);
    }
    
    public static ProjectDTO modelToDto(Project model) {
    	ProjectDTO dto = new ProjectDTO();
    	
    	model.setCompany(dto.getCompany());
    	model.setInitialJob(dto.getInitialJob());
    	model.setEndJob(dto.getEndJob());
    	model.setRole(dto.getRole());
    	model.setTechnologicalExperiences(dto.getTechnologicalExperiences());
    	model.setNameGraduate(dto.getNameGraduate());
    	
    	return dto;
    }

    public static Graduate dtoToModel(GraduateDTO dto) {
    	List<Project> graduates = dto.getProjects().stream().map(DataMaper::dtoToModel).collect(Collectors.toList());
        return new Graduate(
            dto.getName(),
            dto.getAddress(),
            dto.getLocation(),
            dto.getCoverLetter(),
            dto.getOpenToWork(),
            dto.getPhoto(),
            dto.getExperience(),
            graduates
        );
    }
    
    public static GraduateDTO modelToDto(Graduate model) {
        List<ProjectDTO> projects = model.getProjects()
                                          .stream()
                                          .map(DataMaper::modelToDto)
                                          .collect(Collectors.toList());
        GraduateDTO dto = new GraduateDTO();
        dto.setName(model.getName());
        dto.setAddress(model.getAddress());
        dto.setCoverLetter(model.getCoverLetter());
        dto.setExperience(model.getExperience());
        dto.setLocation(model.getLocation());
        dto.setOpenToWork(model.getOpenToWork());
        dto.setPhoto(model.getPhoto());
        dto.setProjects(projects);
        return dto;
    }
    
    public static List<GraduateDTO> graduadosDtoToModel(List<Graduate> models) {
        return models.stream()
                     .map(DataMaper::modelToDto)
                     .collect(Collectors.toList());
    }
    
    public static List<Graduate> graduadosModelToDto(List<GraduateDTO> dto) {
        return dto.stream()
                     .map(DataMaper::dtoToModel)
                     .collect(Collectors.toList());
    }
    
    public static List<ContactDTO> contactsDtoToModel(List<Contact> models) {
        return models.stream()
                     .map(DataMaper::modelToDto)
                     .collect(Collectors.toList());
    }
    
    public static List<Contact> contactsModelToDto(List<ContactDTO> dto) {
        return dto.stream()
                     .map(DataMaper::dtoToModel)
                     .collect(Collectors.toList());
    }
    
    public static List<ProjectDTO> projectDtoToModel(List<Project> model) {
        return model.stream()
                     .map(DataMaper::modelToDto)
                     .collect(Collectors.toList());
    }

	public static List<Project> projectModelToDto(List<ProjectDTO> dto) {
		return dto.stream()
                .map(DataMaper::dtoToModel)
                .collect(Collectors.toList());
	}
}