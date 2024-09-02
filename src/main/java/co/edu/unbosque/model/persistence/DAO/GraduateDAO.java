package co.edu.unbosque.model.persistence.DAO;

import java.util.List;

import co.edu.unbosque.controller.mok.Builder;
import co.edu.unbosque.model.Graduate;
import co.edu.unbosque.model.adapter.DataMaper;

public class GraduateDAO implements DataAccessObject<Graduate> {
	
	private Builder builder = new Builder();

	@Override
	public List<Graduate> getAll() {
		// TODO Auto-generated method stub
		return DataMaper.dtosToModels(builder.getGraduateDTOs());
	}

	@Override
	public void post(Graduate item) {}

}
