package login;

/**
 *
 * @author Fabricio
 */
public class Login {

    public static void main(String[] args) {
        Tokens token1 = Tokens.getInstance();
        Tokens token2 = Tokens.getInstance();
        
        System.out.println(token1);
        System.out.println(token2);
        
        if(token1 == token2){
            System.out.println("Usuarios estão logados");
        }else{
            System.out.println("Usuarios não estçao ligados");
        }
    }
    
}
