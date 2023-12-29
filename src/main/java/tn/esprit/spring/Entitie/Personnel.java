package tn.esprit.spring.Entitie;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom,prenom;
    int age;

    @Temporal(TemporalType.DATE)
    LocalDate dateDeRecrument;

    String login,password;

    @Enumerated(EnumType.STRING)
    Poste poste;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Zone zone;

    @JsonIgnore
    @ToString.Exclude
    @OneToOne
    Zone zonePersonne;
}
