package Modelo.Ciudad;

import Modelo.Paciente.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, Integer> iDCiudad;
    public static volatile CollectionAttribute<Ciudad, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Ciudad, String> nombre;

}