public class Principal{

    public static void main( String [] args){
        Aluno a = new Aluno();
        Professor p = new Professor();

//Dados do aluno   
    a.setNome("Rosa Márcia S. O.");
    //a.setEndereço("AV: Nestor") ;
    a.setTelefone(" 14-3789-77");
    a.setCpf("444444444-1");

//Notas do curso
    a.setCursos("Big Data no Agronegocio");
    //a.setNotas(10,0);
    a.setP1(8.4);
    a.setP2(9.4);  

 // imprime
        System.out.println ( " O aluno: " );
        System.out.println (a.getNome());
        //System.out.println (a.getEndereco());
        System.out.println (a.getTelefone());
        //System.out.println (a.getCpf());
        System.out.println (a.getCursos());

        if (a.verificarAprovado ()) {
            System.out.println ( " Aprovado " );
        } else {
            System.out.println ( " Reprovado " );
        }
    }
    }
