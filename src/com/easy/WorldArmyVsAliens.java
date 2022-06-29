package CodingCompetition.src.com.easy;

/*
World Army vs Aliens | Code Gladiators 2022

The world is going to be attacked by the aliens. The space intelligence department has raised an alarm and the world armies are coming together to fight them. The planning and strategizing is being done to make the maximum impact on the alien ships. The deadly missiles are to be put into action. The missiles are targeted to destroy the alien ships in space and disable them to land on the Earth.


The army is planning to launch the attack at A time (hh mm) to get an advantage. For each attack, they know the time the missile will require to hit the coming alien ship. They all are busy in preparation and want to know the time at which the blast will occur and the alien ship will be destroyed in pieces. Can you find the time of the blast ?


Note: The World Army follows a 24-hour time format and you need to find the time of blast accordingly. The time will be in the hh mm format.


Example:

Input Format
The first line of input consists of the launch time in hh mm format separated by space.

The second line of input consists of the travel time for the missile in hh mm format separated by space.


Constraints
00<= hh <=23

00<= mm <=59


Output Format
Print the time at which the blast will occur and the spaceship will be destroyed.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WorldArmyVsAliens {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[6];
        String launch[] = new String[2];
        String travel[] = new String[2];

        launch = br.readLine().trim().split("\\s");
        travel = br.readLine().trim().split("\\s");

        arr[0] = Integer.parseInt(launch[0]);
        arr[1] = Integer.parseInt(launch[1]);
        arr[2] = Integer.parseInt(travel[0]);
        arr[3] = Integer.parseInt(travel[1]);

        
        int temp1 = arr[2]*60 + arr[3] + arr[1];

        int temp2 = temp1/60;
        int temp3 = temp1%60;

        if(arr[0] + temp2 >=24)
            arr[4] = (arr[0] + temp2) % 24;
        else
            arr[4] = arr[0] + temp2;
        
        arr[5] = temp3;

        System.out.println(arr[4] + " " + arr[5]);
        
    }
}