package monsters;

import java.util.Random;

import bases.Monster;

public class Slime extends Monster {

	// 乱数インスタンス生成
	private static Random r = new Random();

	public Slime(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してslimeのヒットポイントを作成
		int slimeHp = r.nextInt(130 - 70 + 1) + 70;
		// 作成したヒットポイントをsetする
		setHp(slimeHp);

		// 乱数の範囲を指定してslimeの攻撃力を作成
		int slimeOffensive = r.nextInt(11 - 5 + 1) + 5;
		// 作成した攻撃力をsetする
		setOffensive(slimeOffensive);
	}
}
