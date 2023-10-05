public class Game {

    public void gameRun() {
        MenuExample menu = new MenuExample();

        do {
            menu.mostrarMenu();
            switch (menu.eleccion) {
                case 1:
                    System.out.println("Playing");
                    break;
                case 2:
                    System.out.println("Config game");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Elige una opción que sea 1, 2 o 3");
                    break;
            }
        } while (menu.eleccion != 3);
    }
}