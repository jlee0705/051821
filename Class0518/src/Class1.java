import java.util.Random;

public class Class1 {

	public static void main(String[] args) { //static �� �ν��Ͻ������̶��� ����, �ѹ��� ���������!
		String name[] = {"ȫ�浿", "����ġ", "������", "������", "�̼���"};
		int score[] = {20, 40, 60, 80, 100};
		Random r = new Random();
		
		System.out.println("--------------------------------------");
		System.out.println("�б�: " + StudentScore.school);
		System.out.println("--------------------------------------");
		StudentScore arr[] = new StudentScore[5];
		for (int i=0; i<arr.length; i++) {
			System.out.println("��ȣ: " + (i+1));
			arr[i] = new StudentScore(name[r.nextInt(5)],
					score[r.nextInt(5)], 
					score[r.nextInt(5)] , 
					score[r.nextInt(5)]);  //5���� �迭�ȿ� �������
			arr[i].makeSum();
			arr[i].makeAvg();
			arr[i].makeGrade();
			arr[i].showInfo();
						
		}
		
		StudentScore sc  = new StudentScore();
		sc.showInfo();
	}
}
