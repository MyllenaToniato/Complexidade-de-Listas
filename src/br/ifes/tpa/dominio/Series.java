package br.ifes.tpa.dominio;

public class Series {
    private String nome; // Nome da série
    private int ano; // Ano de lançamento
    private String pais; // País de origem

    public Series (String nome, int ano, String pais) {
        this.nome=nome;
        this.ano=ano;
        this.pais=pais;
    }

    @Override
    public boolean equals(Object a){
        if (a instanceof Series)
            return this.nome.equals(((Series) a).nome);
        else
            return false;
    }

    @Override
    public String toString() {
        return nome + " , " + Integer.toString(ano) + " , " + pais ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
