package Modelo.Remision;

import Modelo.Examen.Examen;
import Modelo.Medico.Medico;
import Modelo.Paciente.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Remision.class)
public class Remision_ { 

    public static volatile SingularAttribute<Remision, Date> fecha;
    public static volatile SingularAttribute<Remision, Medico> iDMedico;
    public static volatile SingularAttribute<Remision, Paciente> iDPaciente;
    public static volatile CollectionAttribute<Remision, Examen> examenCollection;
    public static volatile SingularAttribute<Remision, Integer> iDRemision;

}