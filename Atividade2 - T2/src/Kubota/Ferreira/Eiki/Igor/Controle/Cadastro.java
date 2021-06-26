package Kubota.Ferreira.Eiki.Igor.Controle;

import java.io.*;
import java.util.*;
;

public class Cadastro {

    public static void Cadastrar(){
        String func, nome, email;
        Scanner input = new Scanner(System.in);

        System.out.println("Função do usuário:");
        func = input.nextLine();

        System.out.println("Nome do usuário:");
        nome = input.nextLine();

        System.out.println("Email do usuário:");
        email = input.nextLine();

        File fw = null;
        try {
            fw = new File("Dados.txt");
            FileWriter fwArquivo = null;

            // Verifica se o arquivo existe
            // Se existir, ele abre par adicionar dados
            // se nao existir, ele cria o arquivo
            if (fw.exists() == true) {
                fwArquivo = new FileWriter(fw, true);
            } else {
                fwArquivo = new FileWriter(fw);
            }

            BufferedWriter bw = new BufferedWriter(fwArquivo);

            //escreve o registro no arquivo e pula uma linha com o \n
            bw.write(func+"; "+nome+"; "+email+"\n");

            //fecha o arquivo
            bw.close();
            fwArquivo.close();

        } catch (Exception e) {
            System.err.println("Erro ao inserir linhas no arquivo: " + fw);
        }

        List<Dados> dados = new ArrayList<>();
        File file = new File("Dados.txt");

        //Realiza a leitura do conteúdo desse arquivo
        try{
            //Cria elemento para iterar pelo arquivo
            Scanner scanner = new Scanner(file);
            //Passa por todos os elementos do arquivo
            while(scanner.hasNext()){
                int i = 0;
                String linha = scanner.nextLine();
                dados.add(Dados.pegaDados(linha));
            }

            //Criação do CSV
            FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
            fileWriter.write("=== Dados dos Usuarios ===\n");
            fileWriter.write("Funcao;Nome;Email;ID\n");
            int ID = 0;
            for (Dados dado : dados) {
                fileWriter.append(dado.funcao+"; "+dado.nome+"; "+dado.email+"; "+ID+"\n");
                ID++;
            }
            fileWriter.close();
        }
        catch (Exception exception){
            System.out.println("Algo deu errado:");
        }
    }
}