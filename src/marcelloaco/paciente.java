/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcelloaco;

/**
 *
 * @author Marcello
 */
public class paciente {
    
    /**
     * @return the idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nome
     */
    public string getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(string nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public string getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(string cpf) {
        this.cpf = cpf;
    }
            private int idPaciente;
            private int idade;
            private string nome;
            private string cpf;
    
}
