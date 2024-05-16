public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone meuDispositivo = new Iphone();

        // reprodutor musical
        System.out.println("Abrindo Aplicativo de música");
        meuDispositivo.tocar();
        meuDispositivo.pausar();
        meuDispositivo.selecionarMusica("Imagine - John Lennon");

        // aparelho telefônico
        meuDispositivo.ligar("123456789");
        meuDispositivo.atender();
        meuDispositivo.iniciarCoreioVoz();

        // navegador de internet
        meuDispositivo.exibirPagina("www.example.com");
        meuDispositivo.adicionarNovaAba();
        meuDispositivo.atualizarPagina();
    }
}