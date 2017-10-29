package Modelo.Genero;

import Modelo.Paciente.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Genero.class)
public class Genero_ { 

    public static volatile SingularAttribute<Genero, Integer> iDGenero;
    public static volatile SingularAttribute<Genero, String> genero;
    public static volatile CollectionAttribute<Genero, Paciente> pacienteCollection;

}