package tn.esprit.spring.Entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Parking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    String designation;
    String adresse;
    int capacite;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "parking")
    List<Zone> listZone;

}
