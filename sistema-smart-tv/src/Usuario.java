public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv() ;


        System.out.println("Canal Atual ? " + smartTv.canal) ;

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? " + smartTv.canal) ;

        System.out.println("Tv Ligada ? " + smartTv.ligada) ;
        System.out.println("Canal Atual ? " + smartTv.canal) ;
        System.out.println("Volume Atual ? " + smartTv.volume) ;

        smartTv.ligar ();
        System.out.println(" Status Tv Ligada ? " + smartTv.ligada) ;
        System.out.println("Status Canal Atual ? " + smartTv.canal) ;
        System.out.println("Status Volume Atual ? " + smartTv.volume) ;

        smartTv.desligar();
        System.out.println("Tv Ligada ? " + smartTv.ligada) ;
        System.out.println("Canal Atual ? " + smartTv.canal) ;
        System.out.println("Volume Atual ? " + smartTv.volume) ;



        
    }
}
