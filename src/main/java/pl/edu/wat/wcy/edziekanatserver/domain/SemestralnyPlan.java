package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class SemestralnyPlan {

    @Id
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "semestr_id")
    private Semestr term;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "rok_id")
    private Rok year;

    @OneToMany(mappedBy = "termTimetable")
    private List<BlokZajec> lessonBlocs;
}
