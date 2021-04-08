package carvalho.murilo;

public class D4TestDrive {
    public static void main(String[] args) {
        D4 dado = new D4();
        System.out.println("Acabou de gerar:" + dado.lerFaceAtual());
        for (int i = 0; i < 10; i++) {
            System.out.println("Gerou:"+dado.lancarDadoELerFace());
            System.out.println("Confirmando:" + dado.lerFaceAtual());
        }
    }
}
