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
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int id;

    public String name;
    public String description;
    public String url;

@OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
    public List<Examen> examen;

@OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
    public List<Lesson> lessons;

@OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
    public List<Inscription> inscriptions;

@ManyToOne
    @JoinColumn(name = "id_professor",nullable = false)
    private Professor professor;


}
