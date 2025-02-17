package ee.sdaacademy.petclinic.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.acl.Owner;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class PetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int petTypeId;
    String name;
    @OneToMany(mappedBy = "petType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JoinColumn(name = "petId")
    List<Pet> petList;
}
