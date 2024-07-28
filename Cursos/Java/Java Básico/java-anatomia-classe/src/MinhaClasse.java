public class MinhaClasse {
    public static void main(String[] args) {
       
       String nome          = "Edemarch";
       String sobrenome     = "Moireira da Silva";
      
       String nomeCompleto = nomeCompleto(nome, sobrenome);

       System.out.println(nomeCompleto);


    }

    public static String nomeCompleto(String nome,String sobrenome)
    {
        return nome.concat(" ").concat(sobrenome);
    }
    
}
