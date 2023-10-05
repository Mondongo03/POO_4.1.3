import java.util.Scanner;

public class MenuExample {

    int eleccion;
        public void mostrarMenu() {

            Scanner input = new Scanner(System.in);

                System.out.println("1.Play");
                System.out.println("2.Settings");
                System.out.println("3.Exit");

                eleccion = input.nextInt();

        }

        public  void  mostrarConfig(){
            Scanner input = new Scanner(System.in);

            System.out.println("1.Players");
            System.out.println("2.Level");
            System.out.println("3.Return");

            eleccion = input.nextInt();
        }
        public void mostrarConfigPlayers(){
            Scanner input = new Scanner(System.in);
            System.out.println("Cuants Players van a jugar (max 4)");
            

        }
}
