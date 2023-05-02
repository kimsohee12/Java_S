package 숫자게임만들기;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // 개발자2
      // : 사용자가 보여질 부분이 들어갈 곳
      // 뷰~
      Scanner sc = new Scanner(System.in);

      // GameDummy game = new GameDummy();
      PlusGame game = new PlusGame();
      

      boolean sw = true;
      int menu; // 회원가입,로그인 입력값
      int menuDi;// 난이도 입력값
      int menuOp;// 연산자 입력값
      int input; // 정답 입력값
      String id;
      String pw;

      while (sw) {
         System.out.print("[1]회원가입 [2]로그인 >> ");
         menu = sc.nextInt();
         switch(menu) {
         case 1:
            System.out.println("===========회원가입===========");
            System.out.print("아이디 : ");
            id = sc.next();            
            System.out.print("비밀번호 : ");
            pw = sc.next();
            game.signup(id, pw);
            System.out.println("회원가입 성공");
            break;
         case 2:
            System.out.println("===========로그인===========");
            System.out.print("아이디 입력 >> ");
            id = sc.next();            
            System.out.print("비밀번호 입력 >> ");
            pw = sc.next();
            if (game.login(id, pw)) {
               System.out.println("로그인 성공");
               sw = false;
               break;
            } else {
               System.out.println("로그인 실패");
               continue;
            }
         }
      }
      System.out.println("=========사칙연산 게임 start!=========");
      while (true) {
         System.out.println("[1]초급 [2]중급 [3]고급 [4]지옥 [5]게임종료");
         System.out.print("난이도 고르세요 >> ");
         menuDi = sc.nextInt();
         if(menuDi==5) {
        	 System.out.println("게임종료");
        	 break;
         }
         game.setDifficult(menuDi);
         System.out.println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기");
         System.out.print("연산자 고르세요 >> ");
         menuOp = sc.nextInt(); 
         game.setOP(menuOp);
         for(int i=0;i<6;i++) {
        	 
         String msg = game.getQuizMsg(); // 문제 출력
         System.out.printf(msg);
         input = sc.nextInt(); // 답 입력
         while (true) {
            if (game.checkAnswer(input)) {
               System.out.println("정답입니다!");
               break;
            } else {
               System.out.println("틀렸습니다!");
               i++;
               if(i>=5) {
            	   System.out.println("3번 틀렸습니다. 다시 문제 선택 하세요.");
               }
               break;
            }
         }
         }
      }
      
      
      
      
   }

}