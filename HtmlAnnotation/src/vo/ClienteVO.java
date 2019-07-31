package vo;

import annotations.Html;
import enums.Sexo;

@Html
public class ClienteVO extends PessoaVO{
	
	private String cpf;
	
	private String email;
	
	private Sexo sexo;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
}
