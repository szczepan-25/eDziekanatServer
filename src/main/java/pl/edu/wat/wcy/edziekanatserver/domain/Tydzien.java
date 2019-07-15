package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@Entity
public class Tydzien {

    @Id
    private long id;

    @NotNull
    private int name;
}
