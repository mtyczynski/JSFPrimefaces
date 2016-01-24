package entities;

import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-24T18:57:35")
@StaticMetamodel(Cure.class)
public class Cure_ { 

    public static volatile SingularAttribute<Cure, Person> idPerson;
    public static volatile SingularAttribute<Cure, String> curename;
    public static volatile SingularAttribute<Cure, String> description;
    public static volatile SingularAttribute<Cure, Long> id;

}