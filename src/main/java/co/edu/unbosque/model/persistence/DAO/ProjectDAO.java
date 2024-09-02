package co.edu.unbosque.model.persistence.DAO;

import java.util.List;

import co.edu.unbosque.controller.mok.Builder;
import co.edu.unbosque.model.Project;
import co.edu.unbosque.model.adapter.DataMaper;

public class ProjectDAO implements DataAccessObject<Project> {

	private Builder builder = new Builder();

	@Override
	public List<Project> getAll() {
		return DataMaper.projectModelToDto(builder.getProjectDTOs());
	}

	@Override
	public void post(Project item) {}
	
}
