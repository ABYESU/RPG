package monsters;

import java.util.Random;

import bases.Monster;

public class Oak extends Monster {

	// 乱数インスタンス生成
	private static Random r = new Random();

	public Oak(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してoakのヒットポイントを作成
		int oakHp = r.nextInt(230 - 170 + 1) + 170;
		// 作成したヒットポイントをsetする
		setHp(oakHp);

		// 乱数の範囲を指定してoakの攻撃力を作成
		int oakOffensive = r.nextInt(15 - 9 + 1) + 9;
		// 作成した攻撃力をsetする
		setOffensive(oakOffensive);
	}
}
