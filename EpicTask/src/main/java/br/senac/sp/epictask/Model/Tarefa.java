package br.senac.sp.epictask.Model;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Data
@EntityScan
public class Tarefa {

    @Id @GeneratedValue(S)
    private Long id;
    private String titulo;
    private String descricao;
}
