package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
public class BlokZajec {

    @Id
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "numer_bloku_id")
    private NumerBloku blocNo;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "budynek_id")
    private Budynek building;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala room;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "poczatek_bloku_id")
    private PoczatekBloku startTime;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "koniec_bloku_id")
    private KoniecBloku endTime;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "przedmiot_id")
    private Przedmiot subject;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "prowadzacy_id")
    private Prowadzacy lecturer;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "grupa_id")
    private Grupa group;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "dzienny_plan_id")
    private DziennyPlan dayTimetable;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "tygodniowy_plan_id")
    private TygodniowyPlan weekTimetable;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "miesieczny_plan_id")
    private MiesiecznyPlan monthTimetable;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "semestralny_plan_id")
    private SemestralnyPlan termTimetable;

}
