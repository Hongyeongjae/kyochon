package Star;
import java.util.*;


public class One {
    
    public void One(){
        System.out.println("숫자를 입력해주세요.");
        Scanner input = new Scanner(System.in);
        
    int answer;    // 입력받은 정수        
    int heigt;    // 총 세로 길이        
    int width;    // 총 가로 길이        
    int top;    // 상단        
    int radius;    // 반지름 
    // 입력받은 정수 저장        
    answer = input.nextInt();
    // 총 세로 길이 생성        
    heigt = answer * 18;
    // 총 가로 길이 생성        
    width = answer * 40;
    // 상단, 하단 종료 위치 지정        
    top = heigt / 2;
    // 반지름        
    radius = heigt / 2 + 1;
    //        System.out.println("입력한 정수 : " + answer);         // 입력받은 정수
    //        System.out.println("총 세로 길이 : " + heigt);         // 총 세로 길이
    //        System.out.println("총 가로 길이 : " + width);        // 총 가로 길이
    //        System.out.println("상단 : " + top);                 // 상단
    //        System.out.println("반지름 : " + radius);            // 반지름  
    
    char[][] star = new char[heigt][width];

    // 가공한 정수를 배열 생성에 사용   
    
    int start = 0;    // 시작 지점         
    int end = 0;    // 종료 지점   
    
    // 원 상단 생성   
    
    for(int a = top; a > 0 ; a--){int bLine =(int) Math.round(Math.sqrt(Math.pow(radius - 1, 2) - Math.pow(a, 2)));
    
        // 피타고라스 공식
        
    bLine = (bLine + 1) * 2;

    // 가로 행의 중앙에서 양쪽으로 점을 찍어야 되는 거리           
    
    //            System.out.println(a+ "행의 길이는 " + bLine +" 입니다.");             
    int realRow = Math.abs(a - top);    // 세로 행의 위치            
    start = (width / 2) - bLine;    // 가로 행의 시작 지점            
    end = ((width / 2) - 1) + bLine;// 가로 행의 종료 지점 
    //            System.out.println("시작 : " + start +" / 종료 : " + end);                        
    // 배열에 원 상단 입력            
    for(int b = 0 ; b < width ; b++){
        if(start <= b && b < end) {
            star[realRow][b] = '*';
        }else {
            star[realRow][b] = ' ';
        }}}
        // 원 상단 출력        
        for(int a = 0 ; a < top ; a++){
            for(int b=0 ; b < width ; b++){
                System.out.print(star[a][b]);
            }
            System.out.println();
        }
        // 원 하단 출력 (상단을 반전해서 출력)        
        for(int a = top - 1 ; a >= 0 ; a--){
            for(int b=0 ; b < width ; b++){
                System.out.print(star[a][b]);
            }System.out.println();}}}

