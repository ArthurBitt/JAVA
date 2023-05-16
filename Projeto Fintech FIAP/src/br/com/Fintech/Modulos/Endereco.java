package br.com.Fintech.Modulos;

public class Endereco {
    private static String rua;
    private static String bairro;
    private static String cidade;
    private static String estado;
    private static String cep;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        Endereco.rua = rua;
    }

    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        Endereco.bairro = bairro;
    }

    public static String getCidade() {
        return cidade;
    }

    public static void setCidade(String cidade) {
        Endereco.cidade = cidade;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        Endereco.estado = estado;
    }

    public static String getCep() {
        return cep;
    }

    public static void setCep(String cep) {
        Endereco.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco:" +
                " \n.Rua: "+  this.rua + " \n.Bairro: " + this.bairro + " \n.Cidade: " + this.cidade + " \n.Estado: " + this.estado + "\n.Cep: " + this.cep;
    }
}
