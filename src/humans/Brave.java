package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	public Brave(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してbraveのヒットポイントを作成
		int braveHp = Dice.get(170, 230);
		// 作成したヒットポイントをsetする
		setHp(braveHp);

		// 乱数の範囲を指定してbraveの攻撃力を作成
		int braveOffensive = Dice.get(7, 13);
		// 作成した攻撃力をsetする
		setOffensive(braveOffensive);
	}
}
