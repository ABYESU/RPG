package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	public Fighter(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してfighterのヒットポイントを作成
		int fighterHp = Dice.get(240, 300);
		// 作成したヒットポイントをsetする
		setHp(fighterHp);

		// 乱数の範囲を指定してfighterの攻撃力を作成
		int fighterOffensive = Dice.get(17, 23);
		// 作成した攻撃力をsetする
		setOffensive(fighterOffensive);
	}
}
