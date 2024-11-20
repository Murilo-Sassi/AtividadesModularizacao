import java.util.Scanner;

public class MiniChatBot {
    public static void main(String[] args) {

        String comando = "";
        MiniChat chat = new MiniChat();
        String ola = chat.saudacao();
        System.out.println(ola);
        chat.saudacao();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Usuário: ");
            comando = scanner.nextLine();

            if(comando.toUpperCase().contains("OLA")) {
                chat.responderOi();
            }
            if(comando.toUpperCase().contains("ESTA")){
                chat.responderBem();
            }
            if(comando.toUpperCase().contains("NOME")){
                chat.responderNome();
            }
            if(comando.contains("sair")){
                chat.sair();
            }
        } while (!comando.contains("sair"));

    }
}