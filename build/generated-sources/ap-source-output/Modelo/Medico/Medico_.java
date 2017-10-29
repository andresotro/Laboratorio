package Modelo.Medico;

import Modelo.Remision.Remision;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, Integer> iDMedico;
    public static volatile SingularAttribute<Medico, String> password;
    public static volatile SingularAttribute<Medico, Integer> nroRegistros;
    public static volatile CollectionAttribute<Medico, Remision> remisionCollection;
    public static volatile SingularAttribute<Medico, String> apellido;
    public static volatile SingularAttribute<Medico, String> usuario;
    public static volatile SingularAttribute<Medico, Long> identificacion;
    public static volatile SingularAttribute<Medico, Long> telefono;
    public static volatile SingularAttribute<Medico, String> nombre;

}