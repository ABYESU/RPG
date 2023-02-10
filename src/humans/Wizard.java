package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	public Wizard(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してwizardのヒットポイントを作成
		int wizardHp = Dice.get(120, 180);
		// 作成したヒットポイントをsetする
		setHp(wizardHp);

		// 乱数の範囲を指定してwizardの攻撃力を作成
		int wizardOffensive = Dice.get(12, 18);
		// 作成した攻撃力をsetする
		setOffensive(wizardOffensive);
	}
}
