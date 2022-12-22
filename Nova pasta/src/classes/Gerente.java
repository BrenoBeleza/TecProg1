/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Gerente {
    private int codigoGerente;
//    private long cpfGerente;
    private String nomeGerente;    
//    private String funcao;
    
    private ArrayList<Cliente> listaClientes;
    

    public Gerente(int codigoGerente, String nomeGerente) { //public Gerente(int codigoGerente, long cpfGerente, String nomeGerente, String funcao) {
        this.codigoGerente = codigoGerente;
//        this.cpfGerente = cpfGerente;
        this.nomeGerente = nomeGerente;
//        this.funcao = funcao;
        this.listaClientes = new ArrayList();
    }

    public int getCodigoGerente() {
        return codigoGerente;
    }

    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }

//    public long getCpfGerente() {
//        return cpfGerente;
//    }

//    public void setCpfGerente(long cpfGerente) {
//        this.cpfGerente = cpfGerente;
//    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

//    public String getFuncao() {
//        return funcao;
//    }
//
//    public void setFuncao(String funcao) {
//        this.funcao = funcao;
//    }
//
//    
    
}
