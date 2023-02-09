package humans;

import java.util.Random;

import bases.Human;

public class Brave extends Human {

	// 乱数インスタンス生成
	private static Random r = new Random();

	public Brave(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してbraveのヒットポイントを作成
		int braveHp = r.nextInt(230 - 170 + 1) + 170;
		// 作成したヒットポイントをsetする
		setHp(braveHp);

		// 乱数の範囲を指定してbraveの攻撃力を作成
		int braveOffensive = r.nextInt(13 - 7 + 1) + 7;
		// 作成した攻撃力をsetする
		setOffensive(braveOffensive);
	}
}
