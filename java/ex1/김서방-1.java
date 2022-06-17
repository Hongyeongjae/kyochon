import java.util.ArrayList;

public class hello {
    
    public static void main(String[] abcd) {
        System.out.println("Hello worle");
    
    // String[] inputText = {"Kim", "June"};
    ArrayList<String> inputArray = new ArrayList<String>();
    inputArray.add("Jane");
    inputArray.add("Kim");
    System.out.println(solution(inputArray));
    }

public static String solution(ArrayList<String> seoul) {
    String answer = "";
    //seoul 배열을 순회해서 Kim의 위치 찾기
    for(int i = 0; i<seoul.size(); i++) {
        if(seoul.equals("Kim")){
        // if(seoul.get(i) == "Kim")
        //검색 추천 문장 : java 값 비교 (주소비교, 값비교)
        //equals
        //위치 저장
    }
    // stringBuffer text_test = new StringBuffer("Hello");
    text_test.append( "abc" );
    // System.out.println(text_test);

    //"김서방은 [배열위치]에 있다" (string 불변성)
    // answer = 김서방 + [배열위치] + 에 있다
    return answer;}
}
}