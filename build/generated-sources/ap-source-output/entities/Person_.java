package entities;

import entities.Cure;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-24T18:57:35")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> firstname;
    public static volatile CollectionAttribute<Person, Cure> cureCollection;
    public static volatile SingularAttribute<Person, Long> id;
    public static volatile SingularAttribute<Person, String> lastname;

}