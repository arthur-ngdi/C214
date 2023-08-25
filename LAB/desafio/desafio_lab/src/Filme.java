public class Filme {

    String titulo;
    Integer ano;
    String genero;
    String duracao;
    String assistido;
    Double nota;

    public Filme(String titulo, Integer ano,
                 String genero, String duracao,
                 String assistido, Double nota){

        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.duracao = duracao;
        this.assistido = assistido;
        this.nota = nota;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAssistido() {
        return assistido;
    }

    public void setAssistido(String assistido) {
        this.assistido = assistido;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void viewDetails(String título){
        System.out.println(this.getAno());
        System.out.println(this.getGenero());
        System.out.println(this.getDuracao());
        System.out.println(this.getAssistido());
        System.out.println(this.getNota());
    }

    public void assistido(String assistido){
        if(assistido.equals("sim") || assistido.equals("nao")){
            this.setAssistido(assistido);
        }else{
            System.out.println("Entre com 'sim' ou 'não'");
        }
    }

    public void avaliar(Double avaliacao){
        if(avaliacao >= 0 && avaliacao <= 10){
            this.setNota(avaliacao);
        }else{
            System.out.println("Entre com um valor de 0 a 10");
        }
    }
}
