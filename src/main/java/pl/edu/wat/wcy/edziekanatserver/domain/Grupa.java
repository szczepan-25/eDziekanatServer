package pl.edu.wat.wcy.edziekanatserver.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Grupa {

    @Id
    private long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "group")
    private List<BlokZajec> lessonBlocs;
    @OneToMany(mappedBy = "group")
    private List<Student> students;
}
