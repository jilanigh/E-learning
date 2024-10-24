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
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int id;
    public String datePaiement;
    public String montant;
    public String modePaiement;

    @ManyToOne
    @JoinColumn(name = "id_course",nullable = false)
    private Cours cours;

    @ManyToOne
    @JoinColumn(name = "id_student",nullable = false)
    private Etudiant etudiant;


}
