// import src.*;
// import src3.NewLaptop.*;

import java.util.ArrayList;
import java.util.Scanner;

import src3.CheckYn;
import src3.OsCheck;;
public class App {
    public static void main(String[] args) {
        
    //     //인스턴스 생성
    //     Car myCar = new Car();
    //     Car anotherCar = new Car();

    //     //인스턴스의 내용 출력
    //     System.out.println(": " + myCar.company);
    //     System.out.println(": " + myCar.model);
    //     System.out.println(": " + myCar.color);
    //     System.out.println(": " + myCar.maxSpeed);
    //     System.out.println(": " + myCar.speed);

    //     //인스턴스의 값 출력
    //     myCar.speed = 60;
    //     System.out.println("myCar : " + myCar.speed);
    //     System.out.println("anoutherCar : " + anotherCar.speed);

    //     int check = myCar.speedCheck();
    //     System.out.println("this speed = "+check);
    //     System.out.println("calc speed = "+Calc.calcTest(check));

        Scanner input = new Scanner(System.in);
        // System.out.println("컴퓨터 이름은?");
        // String inputCOM = input.nextLine();
        
        // System.out.println("CPU 성능은?");
        // String inputCPU = input.nextLine();

        // System.out.println("RAM 성능은?");
        // String inputRAM = input.nextLine();

        // System.out.println("SSD 성능은?");
        // String inputSSD = input.nextLine();

        // System.out.println("컴퓨터 이름 : " + inputCOM+" // CPU 성능 : "+inputCPU+" // RAM 성능 : "+inputRAM+" // SSD 성능 : "+inputSSD);

        // NewLaptop option = new NewLaptop();
        // NewLaptop option_1 = new NewLaptop(inputCPU);
        // NewLaptop option_2 = new NewLaptop(inputCPU, inputRAM);
        // NewLaptop option_3 = new NewLaptop(inputCPU, inputRAM, inputSSD);

        System.out.println("os타입을 입력하세요");
        System.out.println("1. MAC OS 일 경우는 1을 입력하세요");
        System.out.println("2. Windows OS 일 경우는 2를 입력하세요");

        int osType = input.nextInt();
        OsCheck.OsCheck(osType);

        boolean checkComputerWile = true;
        ArrayList<String> computerArray = new ArrayList<String>();

        boolean branch = false;
        String checkOK = "";
        var computerInputData = "";

        while(checkComputerWile) {
            System.out.println("컴퓨터사양을 입력해 주세요");
            System.out.println("ex) cpu:i7, ram:8g, ssd:128g..");

            computerInputData = input.nextLine();
            System.out.println("입력하신 내용이 다음과 같습니까? 맞으면 yes, 아니면 no를 입력해 주세요");

            System.out.println(computerInputData);
            checkOK = input.nextLine();

            branch = CheckYn.CheckYn(checkOK, "inputCheck");
            if(branch) {
                computerArray.add(computerInputData);
            } else {
                continue;
            };

            System.out.println("데이터를 계속 입력하시겠습니까? 맞으면 yes, 아니면 no를 입력해 주세요");
            checkOK = input.nextLine();
            branch = CheckYn.CheckYn(checkOK, "brakeCheck");

            if(branch) {
                continue;
            }else {
                break;
            }

        }
    }
    }
