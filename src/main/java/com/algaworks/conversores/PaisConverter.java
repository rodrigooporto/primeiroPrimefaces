package com.algaworks.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.algaworks.modelo.Pais;

@FacesConverter("paisConverter")
public class PaisConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null) {
			Pais paisConverter = new Pais(0, value);
			return paisConverter;			
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !value.equals("")) {
			Pais pais = (Pais) value;
			return pais.getNome();
		}
		return null;
	}
}