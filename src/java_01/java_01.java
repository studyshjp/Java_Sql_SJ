package java_01;

public class java_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			// 1. 변수 및 배열 선언
			String Name = "학원";
			String[] todo = {"출석", "공부", "퇴실"};
			System.out.println("=== " + Name + " 할일 목록 ===");
			

			// 2. 반복문(for)과 조건문(if) 활용
			for (int i = 0; i < todo.length; i++) {
			if (i == 0) {
			System.out.println((i + 1) + ". [todo] " + todo[i]);
			} else {
			System.out.println((i + 1) + ". [what] " + todo[i]);
			
			
	}

}
}
}