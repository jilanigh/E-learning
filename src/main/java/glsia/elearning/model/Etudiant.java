package glsia.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Etudiant extends User{

    private String address;


    @OneToMany
    @JoinColumn(name = "id_inscription",nullable = false)
    private List<Inscription> inscription;

    @OneToMany
    @JoinColumn(name = "id_result",nullable = false)
    private List<Result> result;

}
