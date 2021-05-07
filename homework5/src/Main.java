

import java.util.Scanner;

import homework5.business.abstracts.UserService;
import homework5.business.concretes.AutherationManager;
import homework5.business.concretes.UserManager;
import homework5.core.absracts.LoginWGoogleAdapter;
import homework5.dataAccess.concretes.InMemory.InMemoryDao;
import homework5.entities.concretes.User;

public class Main {
	static boolean loggedIn;
    static Scanner scan = new Scanner(System.in);
    static UserService userService = new UserManager(new InMemoryDao());
    static AutherationManager authManager = new AutherationManager(userService,new LoginWGoogleAdapter());

	public static void main(String[] args) {
		
		String mainMessage = "********** Sisteme hos geldiniz **********\n\n" +
                "1. Giris yap\n" +
                "2. Google ile giris yap\n" +
                "3. Kayit ol\n" +
                "4. Cikis Yap\n" +
                "0. Ana mesaji goster\n" +
                "************************************************";
        String loggedMessage = "********** Sisteme hos geldiniz **********\n\n" +
                "1. Hesabimi sil\n"+
                "2. Cikis Yap\n" +
                "0. Mesaji goster\n" +
                "************************************************";;

        System.out.println(mainMessage);
        int key;
        while (true){
            System.out.print("Lutfen islem seciniz: ");
            key = scan.nextInt();
            switch (key){
                case 1:
                    login();
                    break;
                case 2:
                    loginWithGoogle();
                    break;
                case 3:
                    register();
                    break;
                case 4:
                    return;
                case 0:
                    System.out.println(mainMessage);
                    break;
                default:
                    System.out.println("Lutfen dogru bir secim yapiniz.");
            }
            loggedloop:
            while (loggedIn){
                System.out.print("Lutfen islem seciniz: ");
                key = scan.nextInt();
                switch (key){
                    case 1:
                        System.out.println(mainMessage);
                        loggedIn = false;
                        break;
                    case 0:
                        System.out.println(loggedMessage);
                        break;
                    default:
                        System.out.println("Lutfen dogru bir secim yapiniz.");
                }
            }
        }
    }

    public static void register(){
        scan.nextLine();
        String firstName,lastName,mail,password;
        System.out.print("Lutfen adinizi giriniz: ");
        firstName = scan.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        lastName = scan.nextLine();
        System.out.print("Lutfen mailinizi giriniz: ");
        mail = scan.nextLine();
        System.out.print("Lutfen parolanizi giriniz: ");
        password = scan.nextLine();
        User user = new User(InMemoryDao.getLastId() + 1,firstName,lastName,mail,password);
        loggedIn = authManager.register(user);
    }

    public static void login(){
        scan.nextLine();
        String mail,password;
        System.out.print("Lutfen mailinizi giriniz: ");
        mail = scan.nextLine();
        System.out.print("Lutfen parolanizi giriniz: ");
        password = scan.nextLine();
        User user = new User(mail,password);
        loggedIn = authManager.login(user);
    }

    public static void loginWithGoogle(){
        scan.nextLine();
        String mail,password;
        System.out.print("Lutfen mailinizi giriniz: ");
        mail = scan.nextLine();
        System.out.print("Lutfen parolanizi giriniz: ");
        password = scan.nextLine();
        User user = new User(mail,password);
        loggedIn = authManager.loginWGoogle(user);
    }


}


