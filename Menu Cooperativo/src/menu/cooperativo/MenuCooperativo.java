/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.cooperativo;

import java.util.Scanner;

/**
 *
 * @author DAM116
 */
public class MenuCooperativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opt;
        do{
        do{System.out.println("1.-Acceso al canal de discord\n" +
                           "2.-E-mail al admin\n" +
                           "3.-Acceso a GitHub master\n" +
                           "4.-Accede a la playlist de YouTube\n" +
                           "5.- E̶̤̠̬̭̞̿ȧ̴̢̭̞̙͎͌͂́̌́̌͑̓̈́̕͠s̶̨̪̜͙͚̻͈͇̤̟͎̺͕̀͑̃̒̇̀̎́͘͜͝͝ṫ̶̬͌͛́͐͜e̵̢̘̮̯̱͒̊̒̓̎̀́̌̇̎̍̕͝͝͝ṟ̶̢̯̖̟͒̓̿̔͌̋̇̂́͜ ̵̧̖̲̒̅́͛̇͋͜Ē̷̱̣̖̭̙̪͙̳͍̹͖̖̙̈̌͂̒͆̈̄̓͐͗̓̕͝g̶̫͕̪̳̰̬̤͌͗͋͊̈́͛͂̽̇̄̑̆̈́͘͜͝ġ̵̮̜͓͙̈́̇̔\n" +
                           "6.-Salir");
        opt = teclado.nextInt();
        }while((opt<1)||(opt>6));
        switch(opt){
            case(1):
                System.out.println("https://discord.gg/C7gTRyG");
            break;
            case(2):
                System.out.println("eladrimc1999@gmail.com");
            break;
            case(3):
                System.out.println("https://github.com/AdrianGomezVillar/DAM116ED");
            break;
            case(4):
                System.out.println("https://www.youtube.com/playlist?list=PLHGJ9gGi11BJ0_dFLcKA1SHkHRof87NX0");
            break;
            case(5):
                System.out.println("Has encontrado un Easter Egg, Yikes.");
            break;
            case(6):
                System.out.println("Haciendo Alt+F4 al menú.");
            break;
            default:
                
            break;
        }
        System.out.println("");
        }while(opt!=6);
    }
    
}
