package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class Tydzien {

    @Id
    private long id;

    @NotNull
    private int name;

    @OneToMany(mappedBy = "week")
    private List<DziennyPlan> dayTimetables;
    @OneToMany(mappedBy = "week")
    private List<TygodniowyPlan> weekTimetables;
}
