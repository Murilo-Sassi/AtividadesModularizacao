public class MiniChat {

    public String saudacao(){
        return "Olá, eu sou o MiniChatBox. Como posso te ajudar hoje?";

    }

    public void responderOi(){
        System.out.println("MiniChatBot: Olá, Como posso ajudar ?");
    }
    public void responderBem(){
        System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado!");
    }
    public void responderNome(){
        System.out.println("MiniChatbot: Eu sou o MiniChatbot, seu assistente virtual!");
    }
    public void sair(){
        System.out.println("MiniChatbot: Tchau! Até a próxima.");
    }

}