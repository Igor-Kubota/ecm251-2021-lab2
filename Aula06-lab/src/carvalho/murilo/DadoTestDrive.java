package carvalho.murilo;

public class DadoTestDrive {
    public static void main(String[] args) {
        Dado dado = new Dado(6);
        System.out.println("Acabou de gerar:" + dado.lerFaceAtual());
        for (int i = 0; i < 10; i++) {
            System.out.println("Gerou:"+dado.lancarDadoELerFace());
            System.out.println("Confirmando:" + dado.lerFaceAtual());
        }
    }
}
