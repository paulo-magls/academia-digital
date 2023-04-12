package me.dio.academia.digital.entity.form;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "O Id do aluno precisa ser positivo.")
	private Long alunoId;

	public Long getAlunoId() {
		return alunoId;
	}
	
	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatriculaForm other = (MatriculaForm) obj;
		return Objects.equals(alunoId, other.alunoId);
	}
	
}
