package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Semestr {

    @Id
    private long id;

    @NotNull
    private int name;

    @OneToMany(mappedBy = "term")
    private List<DziennyPlan> dayTimetables;
    @OneToMany(mappedBy = "term")
    private List<TygodniowyPlan> weekTimetables;
    @OneToMany(mappedBy = "term")
    private List<MiesiecznyPlan> monthTimetables;
    @OneToMany(mappedBy = "term")
    private List<SemestralnyPlan> termTimetables;
}
