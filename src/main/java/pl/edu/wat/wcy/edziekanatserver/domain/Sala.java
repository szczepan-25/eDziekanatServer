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
public class Sala {

    @Id
    private long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "room")
    private List<BlokZajec> lessonBlocs;
}
