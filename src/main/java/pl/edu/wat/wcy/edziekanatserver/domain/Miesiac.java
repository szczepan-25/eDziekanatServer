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
public class Miesiac {

    @Id
    private long id;

    @NotNull
    private int name;

    @OneToMany(mappedBy = "month")
    private List<DziennyPlan> dayTimetables;
    @OneToMany(mappedBy = "month")
    private List<TygodniowyPlan> weekTimetables;
    @OneToMany(mappedBy = "month")
    private List<MiesiecznyPlan> monthTimetables;

}
