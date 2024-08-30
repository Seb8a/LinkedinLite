package co.edu.unbosque.persistence;

import co.edu.unbosque.model.Formulario;

public class DataMapper {

	public Formulario fromFormularioDTOtoFormulario(FormularioDTO FDTO) {
		Formulario formulario = new Formulario(FDTO.getNombreEgresado(), FDTO.getEmail(), FDTO.getMensaje(),
				FDTO.getFechaLimite());

		return formulario;

	}

	public FormularioDTO fromFormulariotoFormularioDTO(Formulario formulario) {
		FormularioDTO FDTO = new FormularioDTO(formulario.getNombreEgresado(), formulario.getEmail(),
				formulario.getMensaje(), formulario.getFechaLimite());

		return FDTO;

	}

}
