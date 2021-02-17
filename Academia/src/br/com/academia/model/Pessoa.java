package br.com.academia.model;

import java.time.LocalDate;
import java.time.Period;
public class Pessoa {
private String nome;
private double peso;
private double altura;
private String genero;
private LocalDate dataNascimento;
private String nivelAtividade;
public LocalDate setDataNascimento(LocalDate dataNascimento) {
return this.dataNascimento = dataNascimento;
}
public LocalDate getDataNascimento() {
return dataNascimento;
}
//**idade da pessoa **//
public int getIdade() {
LocalDate hoje = LocalDate.now();
Period periodo = Period.between(this.dataNascimento, hoje);
return periodo.getYears();
}
//**Nome**//
public void setNome(String nome) {
this.nome = nome;
}
//**imc**//
public double getImc(double imc) {
	(altura*altura)/peso==imc
			return.imc;
}

public String getNome() {
return this.nome;
}
//**Peso**//
public void setPeso(double peso) {
this.peso = peso;
}
public double getPeso() {
return this.peso;
}
//**Altura**//
public void setAltura(double altura) {
this.altura=altura;
}
public double getAltura() {
return this.altura;
}
//** Genero**//
public void setGenero(String genero) {
this.genero=genero;
}
public String getGenero() {
return this.genero;
}
//** Nivel Atividade**//
public  void setNivelatividade(String nivelatividade) {
if(getGenero().equals("Feminino")){
if(getNivelatividade().equals("Leve")){
this.nivelAtividade = String.valueOf(1.6);
} else if(getNivelatividade().equals("Moderado")){
this.nivelAtividade = String.valueOf(1.6);
} else if(getNivelatividade().equals("Intensa")){
this.nivelAtividade = String.valueOf(1.8);
}
}
if(getGenero().equals("Masculino")){
if(getNivelatividade().equals("Leve")){
this.nivelAtividade = String.valueOf(1.5);
} else if(getNivelatividade().equals("Moderado")){
this.nivelAtividade = String.valueOf(1.8);
} else if(getNivelatividade().equals("Intensa")){
this.nivelAtividade = String.valueOf(2.1);
}
}
}
public String getNivelatividade() {
return this.nivelAtividade;
}
public char[] getImc() {
	return this.getImc();
}

}