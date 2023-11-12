package Login_Program;

import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginApplication {

    public static void main(String[] args) {
        UserHandler handler = new UserHandler();
        Scanner sc = new Scanner(System.in);

        ArrayList<User> list = new ArrayList<User>();
        System.out.println("========== 간단한 로그인 프로그램 ==================");
        System.out.println("[1번] 회원가입 [2번] 로그인 [3번] 회원 조회 [4번] 탈퇴 [5번] 종료");

        while(true){
            try {

                System.out.print("번호를 선택해 주세요 >>> ");
                int ch = sc.nextInt();

                /* 회원가입 */
                if (ch == 1) {
                    System.out.println("[1번] 회원가입을 진행합니다. ");
                    handler.join();

                } else if (ch == 2) {
                    System.out.println("[2번] 로그인을 진행합니다. ");
                    handler.login();
                } else if (ch == 3) {
                    System.out.println("[3번] 회원정보를 조회합니다.");
                    handler.info();
                } else if(ch ==4){
                    System.out.println("[4번] 탈퇴를 진행합니다.");
                    handler.out();
                } else if (ch==5){
                    System.out.println("로그인 프로그램을 종료합니다. ");
                    break;
                } else{
                    System.out.println("1, 2, 3, 4 중에 선택해주세요. ");
                    continue;
                }
            }catch(InputMismatchException e){
                System.out.println("1, 2, 3, 4 중에 선택해주세요.");
                sc.nextLine();
               continue;
            }catch (Exception e){
                sc.nextLine();
                  continue;
            }


        }
    }


}
