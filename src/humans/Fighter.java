package humans;

import java.util.Random;

import bases.Human;

public class Fighter extends Human {

	// 乱数インスタンス生成
	private static Random r = new Random();

	public Fighter(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してfighterのヒットポイントを作成
		int fighterHp = r.nextInt(300 - 240 + 1) + 240;
		// 作成したヒットポイントをsetする
		setHp(fighterHp);

		// 乱数の範囲を指定してfighterの攻撃力を作成
		int fighterOffensive = r.nextInt(23 - 17 + 1) + 17;
		// 作成した攻撃力をsetする
		setOffensive(fighterOffensive);
	}
}
