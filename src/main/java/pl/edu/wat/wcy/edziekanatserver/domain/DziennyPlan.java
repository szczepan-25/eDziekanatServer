package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EntityScan
public class DziennyPlan {

    @Id
    private long id;

    @NotNull
    private Dzien day;
    @NotNull
    private Tydzien week;
    @NotNull
    private Miesiac month;
    @NotNull
    private Semestr term;
    @NotNull
    private Rok year;
}
