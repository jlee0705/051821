import java.util.Random;

public class Class1 {

	public static void main(String[] args) { //static 은 인스턴스영역이랑은 별개, 한번만 만들어진다!
		String name[] = {"홍길동", "전우치", "강감찬", "김유신", "이순신"};
		int score[] = {20, 40, 60, 80, 100};
		Random r = new Random();
		
		System.out.println("--------------------------------------");
		System.out.println("학교: " + StudentScore.school);
		System.out.println("--------------------------------------");
		StudentScore arr[] = new StudentScore[5];
		for (int i=0; i<arr.length; i++) {
			System.out.println("번호: " + (i+1));
			arr[i] = new StudentScore(name[r.nextInt(5)],
					score[r.nextInt(5)], 
					score[r.nextInt(5)] , 
					score[r.nextInt(5)]);  //5개의 배열안에 만들어짐
			arr[i].makeSum();
			arr[i].makeAvg();
			arr[i].makeGrade();
			arr[i].showInfo();
						
		}
		
		StudentScore sc  = new StudentScore();
		sc.showInfo();
	}
}
