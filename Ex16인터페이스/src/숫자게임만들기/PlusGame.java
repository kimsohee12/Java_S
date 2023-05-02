package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Random;


public class PlusGame implements OperatorGame{
   //개발자 1번
   // 자연쌤이 주신 인터페이스를 사용해서 구현하기
   // 기능을 완성하기

   Random rd = new Random();
   ArrayList <Member> list = new ArrayList<Member>();
   int round=0;
   int num1;
   int num2;
   int num=10;
   String op = "-";
   
   
   @Override //랜덤숫자 생성
   public int random() {
      
      return rd.nextInt(num) ;
   }
   @Override // 퀴즈 문장
   public String getQuizMsg() {
       round ++;
       num1 = random()+1;
       num2 = random()+1;
      return round +"라운드 : " + num1 + op +  num2 + " = " ;
   }

   //연산자 변경
   public String setOP(int op) {
      switch (op) {
      case 1:
         return this.op="+";
      case 2:
         return this.op="-";
      case 3:
         return this.op="*";
      case 4:
         return this.op="/";
      }return null;
   }
  
   @Override // 정답 확인
   public boolean checkAnswer(int ans) {
      switch (op) {
      case "+":
         if(num1+num2 == ans) {
            return true;
         }
         break;
      case "-":
         if(num1-num2 == ans) {
            return true;
         }
         break;
      case "*":
         if(num1*num2 == ans) {
            return true;
         }
         break;
      case "/":
         if(num1/num2 == ans) {
            return true;
         }
         break;

      }return false;
   }
   //회원가입
   public void signup (String nickName, String pw) {
      list.add(new Member(nickName, pw));
   }
   //로그인
   public boolean login(String nickName, String pw) {
      for(Member s:list) {
         if(nickName.equals(s.getNickName()) && pw.equals(s.getPw())) {
            return true;
         }
      } return false;
   }
   
   //난이도 설정
   public void setDifficult(int num) {
      
      if(num == 1) {
         this.num = 10;
      }else if (num == 2) {
         this.num = 50;
      }else if (num==3) {
    	  this.num = 100;
      }else if(num==4)  {
         this.num = 1000;
      }
   }
   
   
   
   
   
}