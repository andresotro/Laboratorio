package Modelo.Examen;

import Modelo.Parametro.Parametro;
import Modelo.Remision.Remision;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Examen.class)
public class Examen_ { 

    public static volatile SingularAttribute<Examen, String> descripcion;
    public static volatile CollectionAttribute<Examen, Parametro> parametroCollection;
    public static volatile CollectionAttribute<Examen, Remision> remisionCollection;
    public static volatile SingularAttribute<Examen, Integer> iDExamen;
    public static volatile SingularAttribute<Examen, String> nombre;

}