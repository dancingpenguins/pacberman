package pacman;

public class 봄버맨 extends 캐릭터 {

	boolean 폭탄설치 = false;
	// 폭탄을 설치 후 3초 후 폭팔. 폭탄에 맞은 적은 다시 갇힌다. 자신도 죽을 수 있다. 폭탄에 있는 별들은 그대로 사라진다.

	Runnable 폭탄 = new Runnable() {

		public void run() {
			폭탄설치 = true;
			맵 저장0 = 현재위치;
			맵 저장1 = 현재위치.위;
			맵 저장2 = 현재위치.아래;
			맵 저장3 = 현재위치.왼쪽;
			맵 저장4 = 현재위치.오른쪽;
			맵 저장5 = 현재위치.위.위;
			맵 저장6 = 현재위치.아래.아래;
			맵 저장7 = 현재위치.왼쪽.왼쪽;
			맵 저장8 = 현재위치.오른쪽.오른쪽;
			저장0.이전상태 = 저장0.상태;
			저장0.상태 = 맵구성요소.폭탄;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			저장1.이전상태 = 저장1.상태;
			저장2.이전상태 = 저장2.상태;
			저장3.이전상태 = 저장3.상태;
			저장4.이전상태 = 저장4.상태;
			저장5.이전상태 = 저장5.상태;
			저장6.이전상태 = 저장6.상태;
			저장7.이전상태 = 저장7.상태;
			저장8.이전상태 = 저장8.상태;

			if (저장0.상태 != 맵구성요소.벽) {
				저장0.상태 = 맵구성요소.폭발;
			}
			if (저장1.상태 != 맵구성요소.벽) {
				저장1.상태 = 맵구성요소.폭발;
				if (저장5.상태 != 맵구성요소.벽)
					저장5.상태 = 맵구성요소.폭발;
			}
			if (저장2.상태 != 맵구성요소.벽) {
				저장2.상태 = 맵구성요소.폭발;
				if (저장6.상태 != 맵구성요소.벽)
					저장6.상태 = 맵구성요소.폭발;
			}
			if (저장3.상태 != 맵구성요소.벽) {
				저장3.상태 = 맵구성요소.폭발;
				if (저장7.상태 != 맵구성요소.벽)
					저장7.상태 = 맵구성요소.폭발;
			}
			if (저장4.상태 != 맵구성요소.벽) {
				저장4.상태 = 맵구성요소.폭발;
				if (저장8.상태 != 맵구성요소.벽)
					저장8.상태 = 맵구성요소.폭발;

			}

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			저장0.상태 = 저장0.이전상태;
			저장1.상태 = 저장1.이전상태;
			저장2.상태 = 저장2.이전상태;
			저장3.상태 = 저장3.이전상태;
			저장4.상태 = 저장4.이전상태;
			저장5.상태 = 저장5.이전상태;
			저장6.상태 = 저장6.이전상태;
			저장7.상태 = 저장7.이전상태;
			저장8.상태 = 저장8.이전상태;
			폭탄설치 = false;
			return;
		}
	};

	public void 출력() {
		System.out.print("♠");
	}

	public void 행동() {
		if (!폭탄설치) {
			Thread 폭탄설치 = new Thread(폭탄);
			폭탄설치.start();
		}
	}
}
