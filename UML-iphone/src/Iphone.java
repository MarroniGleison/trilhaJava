import java.util.Scanner;


public class Iphone {

    public interface AparelhoTelefonico {
        void ligar();
        void atender();
        void iniciarCorreioVoz();
    }    

    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica();
    }
    
    public interface NavegadorInternet {
        void exibirPagina();
        void adicionarNovaAba();
        void atualizarPagina();
    }
    
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("1. APARELHO TELEFONICO");
            System.out.println("2. REPRODUTOR MUSICAL");
            System.out.println("3. NAVEGADOR INTERNET");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                 System.out.println("1. LIGAR:");
                 System.out.println("2. ATENDER:");
                 System.out.println("3. ENVIAR MENSAGEM DE VOZ:");
                 int escolha = Integer.parseInt(scanner.nextLine());

                   switch (escolha) {

                     case 1:{
                       System.out.println("LIGAR PARA:");
                       System.out.println("1. Júlia Aguiar");
                       System.out.println("2. Luiza Farias");
                       System.out.println("3. Gabi Borges");
                       int ligar = Integer.parseInt(scanner.nextLine());
                       switch (ligar) {
                        case 1:
                        System.out.println("LIGANDO PARA: Júlia Aguiar");
                        break;

                        case 2:
                        System.out.println("LIGANDO PARA: Luiza Farias");
                        break;

                        case 3:
                        System.out.println("LIGANDO PARA: Gabi Borges");
                        break; 

                        default:
                        System.out.println("OPÇÃO IVÁLIDA!");
                        break;
                        }
                        break;
                        }
                        
 
        
                     case 2:{
                       System.out.println("LIGAÇÃO ATENDIDA!");
                       break;
                       }



                     case 3:
                       System.out.println("ENVIAR MENSAGEM DE VOZ PARA:");
                       System.out.println("LIGAR PARA:");
                       System.out.println("1. Júlia Aguiar");
                       System.out.println("2. Luiza Farias");
                       System.out.println("3. Gabi Borges");
                       int msgVoz = Integer.parseInt(scanner.nextLine());                      
                       switch (msgVoz) {
                        case 1:
                        System.out.println("1. ENVIANDO MENSAGEM DE VOZ PARA: Júlia Aguiar");
                        break;

                        case 2:
                        System.out.println("2. ENVIANDO MENSAGEM DE VOZ PARA: Luiza Farias");
                        break;

                        case 3:
                        System.out.println("3. ENVIANDO MENSAGEM DE VOZ PARA: Gabi Borges");
                        break;

                        default:
                        System.out.println("OPÇÃO IVÁLIDA!");
                        break;
                        }
                        }
                        break;
                    
                        

                case 2:
                 System.out.println("1. SELECIONAR MÚSICA:");
                 System.out.println("2. TOCAR MÚSICA:");
                 System.out.println("3. PAUSAR MÚSICA:");
                 int musica = Integer.parseInt(scanner.nextLine());

                   switch (musica){

                     case 1:
                       System.out.println("1. What I'Done - L. Park");
                       System.out.println("2. Maps - Marron 5");
                       System.out.println("3. Californication - Red Hot Chili Peppers.");
                       int escolhaMusical = Integer.parseInt(scanner.nextLine());
                       switch (escolhaMusical){
                        case 1:
                        System.out.println("MÚSICA SELECIONADA: What I'Done - L. Park");
                        break;
                        
                        case 2:
                        System.out.println("MÚSICA SELECIONADA: Maps - Marron 5");
                        break;
                        
                        case 3:
                        System.out.println("MÚSICA SELECIONADA: Californication - Red Hot Chili Peppers.");
                        break;

                        default:
                        System.out.println("OPÇÃO IVÁLIDA!");
                        break;
                        }
                                                                 
                        case 2:{
                        System.out.println("TOCANDO MÚSICA SELECIONADA");
                        break;
                        }

                        default:
                        System.out.println("OPÇÃO IVÁLIDA!");
                        break;
                        
                        case 3:
                        System.out.println("MÚSICA EM MODO PAUSA");
                        break;
                        }
                        break;

                case 3:
                 System.out.println("1. EXIBIR PÁGINA");
                 System.out.println("2. ADICIONAR NOVA ABA:");
                 System.out.println("3. ATUALIZAR PÁGINA:");
                 int net = Integer.parseInt(scanner.nextLine());

                   switch (net){ 

                      case 1:
                      System.out.println("EXIBINDO NOVA PÁGINA...");
                      break;

                      case 2:
                      System.out.println("NOVA ABA ASICIONADA COM SUCESSO.");
                      break;

                      case 3:
                      System.out.println("PÁGINA ATUALIZADA COM SUCESSO");
                      break;

                      default:
                      System.out.println("OPÇÃO IVÁLIDA!");
                      break;
                     }
                                   
                default:
                break;
           }
          }
         }
        }

             
           
           
       
        
    
      
       
    

