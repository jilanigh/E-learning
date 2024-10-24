package glsia.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int id;
    public int score;

    @ManyToOne
    @JoinColumn(name = "id_exam",nullable = false)
    private Examen examen;

    @ManyToOne
    @JoinColumn(name = "id_student",nullable = false)
    private Etudiant etudiant;
}
