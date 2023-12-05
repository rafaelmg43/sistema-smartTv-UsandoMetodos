public class UsuarioTV {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("TV esta Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ? " + smartTv.ligada);


    }
}
