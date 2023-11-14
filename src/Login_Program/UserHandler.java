package Login_Program;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserHandler {

    String id;
    String nick;
    String pwd;

    User user = null;
    Scanner sc = new Scanner(System.in);

    ArrayList<User> list = new ArrayList<User>();
    public void join(){
        System.out.print("아이디를 입력해주세요 >> ");
        String id = sc.next();
        System.out.print("닉네임을 입력해주세요 >> ");
        String nick = sc.next();
        System.out.print("비밀번호를 입력해주세요 >> ");
        String pwd= sc.next();
        System.out.println("회원가입이 되었습니다. \n ");
        list.add (new User(id,pwd,nick));
      //  System.out.println(list.toString());

    }

    public void login() {
        boolean flag = false;
        while (true) {
            try {
                System.out.print("아이디를 입력해주세요 >> ");
                String id = sc.next();
                if (id.equals("종료")) {
                    System.out.println("로그인을 종료합니다. ");
                    break;
                }
                System.out.print("비밀번호를 입력해주세요 >> ");
                String pwd = sc.next();

                for (int i = 0; i < list.size(); i++) {
                    if (id.equals(list.get(i).getId()) && pwd.equals(list.get(i).getPw())) {
                        System.out.println("*** 로그인 성공 ***");
                        System.out.printf("ID : %s, NickName : %s\n\n", list.get(i).getId(), list.get(i).getNickname());
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.println("회원정보가 불일치합니다. 초기화면으로 돌아갑니다.\n ");
                    break;
                }
                break;
            }catch (Exception e){
                sc.nextLine();
                continue;
            }
        }
    }

    // 정보 조회
    public void info(){
        for (int i =0; i<list.size();i++){
            System.out.println( list.get(i).toString());
        }
    }

    public void out(){
        boolean flag = false;
        try{
            System.out.print("아이디를 입력해주세요 >> ");
            String id = sc.next();

            System.out.print("비밀번호를 입력해주세요 >> ");
            String pwd = sc.next();

            for(int i =0; i<list.size();i++){
                if( id.equals(list.get(i).getId()) && pwd.equals(list.get(i).getPw())){
                    list.remove(i);
                    flag = true;
                    System.out.println(id + "님은 탈퇴하였습니다.\n");
                    break;
                }
            }
            if(flag == false){
                System.out.println("탈퇴에 실패하였습니다. \n");
            }
        }catch(Exception e){

        }

    }

}
