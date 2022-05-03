#include <iostream>
#include <cmath>
using namespace std;
/*
최소이동횟수가 거리가 증가함에 따라 일정주기마다 증가하는 규칙과
이 주기가 두번 반복하면 증가하고 첫번째 반복후에 거리의 제곱근이 주기의 크기와
같음을 사용하였다.(ex-거리가 9일때 주기의 크기는 3 ,이동거리는 3*2-1)
*/
int main(void) 
{
	int T=0;
	
	cin >> T;
	int **testcase =new int*[T];// x,y,최소이동횟수
	
	int move_count = 0; //이동횟수
	
	for (int i = 0; i < T; i++)
	{
		testcase[i] = new int[3];
		cin >> testcase[i][0] >> testcase[i][1];
		
		
		if (testcase[i][1] - testcase[i][0] == 1)
		{
			move_count = 1; //거리가 1이면 이동횟수 1
			
		}
		else if (testcase[i][1] - testcase[i][0] == 2)
		{
			move_count = 2; //거리가 2이면 이동횟수 2
			
		}
		else if (testcase[i][1] - testcase[i][0] == 3)
		{
			move_count = 3; //거리가 3이면 이동횟수 3
			
		}
		else if (sqrt(testcase[i][1] - testcase[i][0])-fmod(sqrt(testcase[i][1] - testcase[i][0]),1) ==sqrt(testcase[i][1] - testcase[i][0]))
		{
			move_count= sqrt(testcase[i][1] - testcase[i][0])*2-1; //거리가 주기의 제곱일때 이동횟수는 주기*2-1
		}
		else 
		{

			if (testcase[i][1] - testcase[i][0] <= pow(sqrt(testcase[i][1] - testcase[i][0]) - fmod(sqrt(testcase[i][1] - testcase[i][0]), 1),2) + sqrt(testcase[i][1] - testcase[i][0]) - fmod(sqrt(testcase[i][1] - testcase[i][0]), 1))
				move_count = (sqrt(testcase[i][1] - testcase[i][0]) - fmod(sqrt(testcase[i][1] - testcase[i][0]), 1)) * 2;//거리의 제곱근이 해당 이동횟수 증가 주기보다 클때
			else
				move_count = (sqrt(testcase[i][1] - testcase[i][0]) - fmod(sqrt(testcase[i][1] - testcase[i][0]), 1)) * 2+1; //작을때
		}
		
		
		testcase[i][2]= move_count;
		
	}
	for (int i = 0; i < T; i++)
	{
		cout << testcase[i][2]<<'\n';
		delete[] testcase[i];
	}
	delete[] testcase;
	return 0;
}