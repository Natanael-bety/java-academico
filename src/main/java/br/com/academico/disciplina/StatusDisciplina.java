package br.com.academico.disciplina;

public enum StatusDisciplina {
    ATIVO,
    DESATIVO;

    public static StatusDisciplina fromString(final String status){
        return StatusDisciplina.valueOf(status);
    }
}
