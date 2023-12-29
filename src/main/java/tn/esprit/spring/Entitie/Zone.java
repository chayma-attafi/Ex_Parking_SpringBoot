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
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String ref;
    float dimension;

    @ToString.Exclude
    @ManyToOne
    Parking parking;

    @ToString.Exclude
    @OneToMany(mappedBy = "zone")
    List<Personnel> listPersonnel;

    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "zonePersonne")
    Personnel personnel;

}
