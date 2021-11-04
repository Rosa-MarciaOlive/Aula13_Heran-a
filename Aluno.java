public class Aluno extends Pessoa{
    private String cursos;
    private String nome;
    private double notas;
    private String telefone;
    private double p1;
    private double p2;



    public void setCursos(String cursos){
        this.cursos=cursos;
   }
   public String getCursos(){
       return this.cursos;
   }


   public void setNome(String nome){
        this.nome=nome;
   }
   public String getNome(){
       return this.nome;
   }


    public void setNotas(double notas){
        this.notas=notas;
   }
   public double getNotas(){
       return this.notas;
   }


    public void setTelefone(String telefone){
        this.telefone=telefone;
   }
   public String getTelefone(){
       return this.telefone;
   }

public void setP1(double p1){
        this.p1=p1;
   }
   public double getP1(){
       return this.p1;
   }


public void setP2(double p2){
        this.p2=p2;
   }
   public double getP2(){
       return this.p2;
   }

//Calculo da Média
   public double calculaMedia(){
       return (this.p1 + this.p2)/2.0;
   }


//Condição pr confirmação se aluno foi aprovado.
   public boolean verificarAprovado(){
       boolean condição;
       if (calculaMedia() < 6){
       condição = false;
   }else{
       condição = true;
   }

   return condição;

}
}