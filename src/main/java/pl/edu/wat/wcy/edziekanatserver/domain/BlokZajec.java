package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
public class BlokZajec {

    @Id
    private long id;

    @NotNull
    private NumerBloku blocNo;
    @NotNull
    private Budynek building;
    @NotNull
    private Sala room;
    @NotNull
    private PoczatekBloku startTime;
    @NotNull
    private KoniecBloku endTime;
    @NotNull
    private Przedmiot subject;
    @NotNull
    private Prowadzacy lecturer;
    @NotNull
    private Grupa group;
    @NotNull
    private DziennyPlan dayTimetable;
    @NotNull
    private TygodniowyPlan weekTimetable;
    @NotNull
    private MiesiecznyPlan monthTimetable;
    @NotNull
    private SemestralnyPlan termTimetable;

}
