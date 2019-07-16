package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Dzien {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private int name;

    @OneToMany(mappedBy = "day")
    private List<DziennyPlan> dayTimetables;

}
