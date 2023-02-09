package monsters;

import java.util.Random;

import bases.Monster;

public class Dragon extends Monster {

	// 乱数インスタンス生成
	private static Random r = new Random();

	public Dragon(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してdoragonのヒットポイントを作成
		int doragonHp = r.nextInt(330 - 270 + 1) + 270;
		// 作成したヒットポイントをsetする
		setHp(doragonHp);

		// 乱数の範囲を指定してdoragonの攻撃力を作成
		int doragonOffensive = r.nextInt(18 - 12 + 1) + 12;
		// 作成した攻撃力をsetする
		setOffensive(doragonOffensive);
	}
}
