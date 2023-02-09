package humans;

import java.util.Random;

import bases.Human;

public class Wizard extends Human {

	// 乱数インスタンス生成
	private static Random r = new Random();

	public Wizard(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してwizardのヒットポイントを作成
		int wizardHp = r.nextInt(180 - 120 + 1) + 120;
		// 作成したヒットポイントをsetする
		setHp(wizardHp);

		// 乱数の範囲を指定してwizardの攻撃力を作成
		int wizardOffensive = r.nextInt(18 - 12 + 1) + 12;
		// 作成した攻撃力をsetする
		setOffensive(wizardOffensive);
	}
}
