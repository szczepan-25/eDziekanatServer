package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class MiesiecznyPlan {

    @Id
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "miesiac_id")
    private Miesiac month;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "semestr_id")
    private Semestr term;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "rok_id")
    private Rok year;

    @OneToMany(mappedBy = "monthTimetable")
    private List<BlokZajec> lessonBlocs;
}
