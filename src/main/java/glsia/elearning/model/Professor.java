package glsia.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Professor extends User{


        private String speciality;

        @OneToMany
        @JoinColumn(name = "id_course", nullable = false)
        private List<Cours> course;


}
